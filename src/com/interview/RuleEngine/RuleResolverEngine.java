package com.interview.RuleEngine;


import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public abstract class RuleResolverEngine<In, Out> {
    private RuleParser ruleParser;

    public Out run(List<Rule> rules, In inputData){
        if(Objects.isNull(rules) || rules.isEmpty())
            return null;

        List<Rule> matchedConditions = getMatchedConditionsSet(rules, inputData);
        Rule finalRule = resolveAndExtractCondition(matchedConditions);
        return Objects.nonNull(finalRule) ? executeRule(finalRule, inputData) : null;
    }

    private List<Rule> getMatchedConditionsSet(List<Rule> rules, In inputData){
        return rules.stream()
                .filter(
                        rule -> {
                            String condition = rule.getCondition();
                            return ruleParser.parseCondition(condition, inputData);
                        }
                )
                .collect(Collectors.toList());
    }
    
    private Rule resolveAndFetchExactCondition(List<Rule> matchedCondition){
        return matchedCondition.stream().findFirst().orElse(null);
    }
    
    private Out executeRule(Rule rule, In inputData){
        Out outResult = initializeOutResult();
        return ruleParser.parseAction(rule.getAction(), inputData, outResult);
    }

    protected abstract Out initializeOutResult();
}
