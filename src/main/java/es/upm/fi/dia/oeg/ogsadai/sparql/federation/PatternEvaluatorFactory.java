package es.upm.fi.dia.oeg.ogsadai.sparql.federation;

import es.upm.fi.dia.oeg.ogsadai.sparql.processor.PatternEvaluator;
import es.upm.fi.dia.oeg.ogsadai.sparql.processor.SimplePatternEvaluator;

public class PatternEvaluatorFactory
{
    // Suppress default constructor for noninstantiability
    private PatternEvaluatorFactory()
    {
        throw new AssertionError();
    }

    public static PatternEvaluator create()
    {
        return new SimplePatternEvaluator();
    }
}
