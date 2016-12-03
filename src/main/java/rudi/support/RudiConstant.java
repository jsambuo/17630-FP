package rudi.support;

import java.util.Arrays;
import java.util.List;

/**
 * Constants
 */
public class RudiConstant {

    public static final String SPACE = " ";
    public static final String START_COMMENT = "/*";
    public static final String END_COMMENT = "*/";
    public static final String PRINT_COMMAND = "print";
    public static final String PROGRAM_COMMAND = "program";
    public static final String DOUBLE_QUOTE = "\"";
    public static final String DECS = "decs";
    public static final String TYPE_INTEGER = "integer";
    public static final String TYPE_FLOAT = "float";
    public static final String TYPE_STRING = "string";
    public static final String ADD = "+";
    public static final String MINUS = "-";
    public static final String MULTIPLY = "*";
    public static final String DIVIDE = "/";
    public static final String EQ = ":eq:";
    public static final String NE = ":ne:";
    public static final String GT = ":gt:";
    public static final String LT = ":lt:";
    public static final String GE = ":ge:";
    public static final String LE = ":le:";
    public static final String AND = "^";
    public static final String OR = "|";
    public static final String NOT = "~";
    public static final String LEFT_PAREN = "(";
    public static final String RIGHT_PAREN = ")";
    public static final String EQUAL_SIGN = "=";
    public static final String CR = "cr";

    public static final List<String> RESERVED_WORDS = Arrays.asList(
            START_COMMENT, END_COMMENT,
            PROGRAM_COMMAND,
            PRINT_COMMAND,
            DECS,
            TYPE_INTEGER, TYPE_FLOAT, TYPE_STRING,
            ADD, MINUS, MULTIPLY, DIVIDE,
            EQ, NE, GT, GE, LT, LE,
            AND, OR, NOT,
            LEFT_PAREN, RIGHT_PAREN,
            EQUAL_SIGN,
            CR
    );
}
