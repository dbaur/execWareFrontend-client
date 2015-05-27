package de.uniulm.omi.cloudiator.colosseum.client.entities.enums;

/**
 * Created by Frank on 27.05.2015.
 */
public enum FormulaOperator {
    /** Kairos aggregators */
    SUM, // ADD, PLUS
    MINUS,
    AVG,
    MEDIAN,
    DEV,
    DIV,
    MIN,
    MAX,
    RATE,
    SAMPLER,
    SCALE,
    COUNT,
    LEAST_SQUARES,
    PERCENTILE,

    /** condition aggregators */
    LT,
    LTE,
    GT,
    GTE,
    EQ,


    /** event aggregators / binary */
    OR,
    AND,
    XOR
}
