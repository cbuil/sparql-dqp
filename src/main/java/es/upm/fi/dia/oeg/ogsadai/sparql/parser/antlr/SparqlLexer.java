// $ANTLR 3.2 Sep 23, 2009 12:02:23 /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g 2013-08-07 14:03:32

    package es.upm.fi.dia.oeg.ogsadai.sparql.parser.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class SparqlLexer extends Lexer {
    public static final int FUNCTION=43;
    public static final int GRAPH=111;
    public static final int IRIORREF=10;
    public static final int DESCRIBE_QUERY=62;
    public static final int CONTAINS=161;
    public static final int BOOLEANLITERAL=7;
    public static final int NOW=174;
    public static final int REGEX=190;
    public static final int PNAME_LN=218;
    public static final int CONSTRUCT=77;
    public static final int SEPARATOR=201;
    public static final int NOT=141;
    public static final int EOF=-1;
    public static final int STRLEN=157;
    public static final int MONTH=167;
    public static final int CLEAR=98;
    public static final int ISLITERAL=188;
    public static final int CREATE=100;
    public static final int EOL=220;
    public static final int PATH_MOD=46;
    public static final int USING=109;
    public static final int BINDING_VALUE=29;
    public static final int NOT_EQUAL=135;
    public static final int BIND=116;
    public static final int QUESTION_MARK=125;
    public static final int TRIPLES_TEMPLATE=30;
    public static final int PN_CHARS_U=231;
    public static final int SELECT_CLAUSE=22;
    public static final int CLOSE_CURLY_BRACE=80;
    public static final int TZ=173;
    public static final int DOUBLE_POSITIVE=208;
    public static final int DIVIDE=123;
    public static final int BOUND=147;
    public static final int A=121;
    public static final int ASC=88;
    public static final int BRACKETTED_EXPRESSION=50;
    public static final int ASK=82;
    public static final int LOAD=95;
    public static final int SEMICOLON=65;
    public static final int ABS=152;
    public static final int CONSTRUCT_TRIPLES=35;
    public static final int GROUP=84;
    public static final int WS=221;
    public static final int SERVICE=115;
    public static final int GROUP_CONDITION=26;
    public static final int SELECT_LIST=58;
    public static final int INTEGER_POSITIVE=206;
    public static final int PATH_PRIMARY=48;
    public static final int DESCRIBE=81;
    public static final int PN_CHARS=232;
    public static final int SUBSELECT=20;
    public static final int DATATYPE=146;
    public static final int GROUP_GRAPH_PATTERN=32;
    public static final int CALL=13;
    public static final int BUILTINCALL=14;
    public static final int DOUBLE_NEGATIVE=211;
    public static final int ASK_QUERY=63;
    public static final int LANG=144;
    public static final int SUBJECT=39;
    public static final int MODIFY=19;
    public static final int IRI_REF=67;
    public static final int SELECT_QUERY=60;
    public static final int NUMERICLITERAL=8;
    public static final int BNODE=150;
    public static final int SUM=195;
    public static final int PREDICATE=40;
    public static final int ENCODE_FOR_URI=160;
    public static final int ASTERISK=71;
    public static final int STR=143;
    public static final int AS=75;
    public static final int WHERE_CLAUSE=23;
    public static final int SAMPLE=199;
    public static final int TRIPLES_NODE=36;
    public static final int EXPRESSION_LIST=34;
    public static final int SUBSTR=191;
    public static final int OFFSET=92;
    public static final int RAND=151;
    public static final int REPLACE=192;
    public static final int AVG=198;
    public static final int DECIMAL_POSITIVE=207;
    public static final int GROUP_CONCAT=200;
    public static final int PLUS=126;
    public static final int PIPE=122;
    public static final int EXISTS=193;
    public static final int UNARY=51;
    public static final int STRLANG=182;
    public static final int ADD=101;
    public static final int INTEGER=91;
    public static final int PATH_ELT_OR_INVERSE=45;
    public static final int BY=85;
    public static final int TO=102;
    public static final int BLANK_NODE=52;
    public static final int PNAME_NS=69;
    public static final int HAVING=86;
    public static final int MIN=196;
    public static final int CLOSE_BRACE=76;
    public static final int MINUS=142;
    public static final int UNION=118;
    public static final int MINUTES=170;
    public static final int PATH_SEQUENCE=47;
    public static final int GROUP_BY=25;
    public static final int STRING_LITERAL_LONG2=217;
    public static final int NEGATION=127;
    public static final int DECIMAL=204;
    public static final int DROP=99;
    public static final int STRING_LITERAL_LONG1=216;
    public static final int MOVE=103;
    public static final int PLX=233;
    public static final int AGGREGATE=6;
    public static final int ORDER_BY=27;
    public static final int GREATER_EQUAL=139;
    public static final int HOURS=169;
    public static final int LANGTAG=202;
    public static final int SIGN=227;
    public static final int PREFIX=68;
    public static final int TERM_NO_PREFIX=56;
    public static final int EXPONENT=226;
    public static final int SILENT=96;
    public static final int SHA256=177;
    public static final int BINDINGS=93;
    public static final int PNAME=53;
    public static final int STRENDS=163;
    public static final int LCASE=159;
    public static final int SHA512=179;
    public static final int COUNT=194;
    public static final int DAY=168;
    public static final int PN_LOCAL_ESC=235;
    public static final int VARNAME=224;
    public static final int STRDT=183;
    public static final int GREATER=137;
    public static final int INSERT=105;
    public static final int PATH=44;
    public static final int SOLUTION_MODIFIER=57;
    public static final int ORDER_CONDITION=28;
    public static final int LESS=136;
    public static final int LANGMATCHES=145;
    public static final int DOUBLE=205;
    public static final int BASE=66;
    public static final int RELATIONALEXPRESSION=12;
    public static final int VAR=24;
    public static final int COMMENT=237;
    public static final int OPEN_CURLY_BRACE=79;
    public static final int SELECT=70;
    public static final int INTO=97;
    public static final int ISIRI=185;
    public static final int COALESCE=180;
    public static final int CONCAT=156;
    public static final int STRSTARTS=162;
    public static final int BLANK_NODE_LABEL=219;
    public static final int TRIPLES_SAME_SUBJECT=38;
    public static final int ARG_LIST=33;
    public static final int DELETE=107;
    public static final int STRBEFORE=164;
    public static final int MINUS_KEYWORD=117;
    public static final int FLOOR=154;
    public static final int ISBLANK=187;
    public static final int CLOSE_SQUARE_BRACKET=129;
    public static final int URI=149;
    public static final int UCASE=158;
    public static final int INVERSE=124;
    public static final int NIL=5;
    public static final int NAMED=83;
    public static final int STRING_LITERAL2=215;
    public static final int OR=132;
    public static final int STRING_LITERAL1=214;
    public static final int FILTER=119;
    public static final int QUERY=16;
    public static final int ROUND=155;
    public static final int LESS_EQUAL=138;
    public static final int FROM=55;
    public static final int FALSE=213;
    public static final int DISTINCT=72;
    public static final int PROPERTY_LIST=59;
    public static final int TERM=54;
    public static final int WHERE=78;
    public static final int YEAR=166;
    public static final int ORDER=87;
    public static final int TIMEZONE=172;
    public static final int LIMIT=90;
    public static final int RDFLITERAL=9;
    public static final int MAX=197;
    public static final int CONSTRUCT_QUERY=61;
    public static final int UPDATE=17;
    public static final int SECONDS=171;
    public static final int STRAFTER=165;
    public static final int AND=133;
    public static final int FROM_CLAUSE=21;
    public static final int IF=181;
    public static final int ISURI=186;
    public static final int BRACKETS=11;
    public static final int SAMETERM=184;
    public static final int IN=140;
    public static final int MD5=175;
    public static final int OBJECT=41;
    public static final int COMMA=120;
    public static final int HEX=236;
    public static final int COPY=104;
    public static final int IRI=148;
    public static final int EQUAL=134;
    public static final int ALL=112;
    public static final int COLLECTION=37;
    public static final int UNDEF=94;
    public static final int DIGIT=225;
    public static final int DOT=113;
    public static final int EXPRESSION=15;
    public static final int PROLOGUE=18;
    public static final int BINDINGS_CLAUSE=64;
    public static final int WITH=108;
    public static final int PERCENT=234;
    public static final int ISNUMERIC=189;
    public static final int OPEN_SQUARE_BRACKET=128;
    public static final int REDUCED=73;
    public static final int DEFAULT=110;
    public static final int INTEGER_NEGATIVE=209;
    public static final int PN_LOCAL=223;
    public static final int REFERENCE=203;
    public static final int PATH_NEGATED=49;
    public static final int SHA1=176;
    public static final int TRIPLES_BLOCK=31;
    public static final int TRUE=212;
    public static final int NOT_EXISTS=42;
    public static final int ECHAR=228;
    public static final int OPTIONAL=114;
    public static final int ANON=4;
    public static final int IRI_REF_CHARACTERS=229;
    public static final int ANY=238;
    public static final int PN_CHARS_BASE=230;
    public static final int VAR1=130;
    public static final int VAR2=131;
    public static final int DECIMAL_NEGATIVE=210;
    public static final int PN_PREFIX=222;
    public static final int CEIL=153;
    public static final int DESC=89;
    public static final int SHA384=178;
    public static final int OPEN_BRACE=74;
    public static final int DATA=106;

    // delegates
    // delegators

    public SparqlLexer() {;} 
    public SparqlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SparqlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g"; }

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:751:4: ( ( ' ' | '\\t' | EOL )+ )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:751:6: ( ' ' | '\\t' | EOL )+
            {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:751:6: ( ' ' | '\\t' | EOL )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( state.backtracking==0 ) {
               _channel=HIDDEN; 
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "BASE"
    public final void mBASE() throws RecognitionException {
        try {
            int _type = BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:753:6: ( ( 'B' | 'b' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:753:8: ( 'B' | 'b' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BASE"

    // $ANTLR start "PREFIX"
    public final void mPREFIX() throws RecognitionException {
        try {
            int _type = PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:755:8: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'X' | 'x' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:755:10: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PREFIX"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:757:8: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:757:10: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "DISTINCT"
    public final void mDISTINCT() throws RecognitionException {
        try {
            int _type = DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:759:10: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:759:12: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DISTINCT"

    // $ANTLR start "REDUCED"
    public final void mREDUCED() throws RecognitionException {
        try {
            int _type = REDUCED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:761:9: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:761:11: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REDUCED"

    // $ANTLR start "CONSTRUCT"
    public final void mCONSTRUCT() throws RecognitionException {
        try {
            int _type = CONSTRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:763:11: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:763:13: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTRUCT"

    // $ANTLR start "DESCRIBE"
    public final void mDESCRIBE() throws RecognitionException {
        try {
            int _type = DESCRIBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:765:10: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:765:12: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESCRIBE"

    // $ANTLR start "ASK"
    public final void mASK() throws RecognitionException {
        try {
            int _type = ASK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:767:5: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'K' | 'k' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:767:7: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASK"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:769:6: ( ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:769:8: ( 'F' | 'f' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "NAMED"
    public final void mNAMED() throws RecognitionException {
        try {
            int _type = NAMED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:771:7: ( ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'D' | 'd' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:771:9: ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAMED"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:773:7: ( ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:773:9: ( 'W' | 'w' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:775:7: ( ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:775:9: ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:777:4: ( ( 'B' | 'b' ) ( 'Y' | 'y' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:777:6: ( 'B' | 'b' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:779:5: ( ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:779:7: ( 'A' | 'a' ) ( 'S' | 's' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:781:6: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:781:8: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:783:7: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:783:9: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "OFFSET"
    public final void mOFFSET() throws RecognitionException {
        try {
            int _type = OFFSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:785:8: ( ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:785:10: ( 'O' | 'o' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OFFSET"

    // $ANTLR start "OPTIONAL"
    public final void mOPTIONAL() throws RecognitionException {
        try {
            int _type = OPTIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:787:10: ( ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:787:12: ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPTIONAL"

    // $ANTLR start "GRAPH"
    public final void mGRAPH() throws RecognitionException {
        try {
            int _type = GRAPH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:789:7: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:789:9: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GRAPH"

    // $ANTLR start "UNION"
    public final void mUNION() throws RecognitionException {
        try {
            int _type = UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:791:7: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:791:9: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNION"

    // $ANTLR start "FILTER"
    public final void mFILTER() throws RecognitionException {
        try {
            int _type = FILTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:793:8: ( ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:793:10: ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FILTER"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            int _type = A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:795:3: ( 'a' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:795:5: 'a'
            {
            match('a'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "STR"
    public final void mSTR() throws RecognitionException {
        try {
            int _type = STR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:797:5: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:797:7: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STR"

    // $ANTLR start "LANG"
    public final void mLANG() throws RecognitionException {
        try {
            int _type = LANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:799:6: ( ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:799:8: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LANG"

    // $ANTLR start "LANGMATCHES"
    public final void mLANGMATCHES() throws RecognitionException {
        try {
            int _type = LANGMATCHES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:801:13: ( ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:801:15: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LANGMATCHES"

    // $ANTLR start "DATATYPE"
    public final void mDATATYPE() throws RecognitionException {
        try {
            int _type = DATATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:803:10: ( ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:803:12: ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATATYPE"

    // $ANTLR start "BOUND"
    public final void mBOUND() throws RecognitionException {
        try {
            int _type = BOUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:805:7: ( ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:805:9: ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOUND"

    // $ANTLR start "SAMETERM"
    public final void mSAMETERM() throws RecognitionException {
        try {
            int _type = SAMETERM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:807:10: ( ( 'S' | 's' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:807:12: ( 'S' | 's' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SAMETERM"

    // $ANTLR start "ISIRI"
    public final void mISIRI() throws RecognitionException {
        try {
            int _type = ISIRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:809:7: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:809:9: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISIRI"

    // $ANTLR start "ISURI"
    public final void mISURI() throws RecognitionException {
        try {
            int _type = ISURI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:811:7: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:811:9: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISURI"

    // $ANTLR start "ISBLANK"
    public final void mISBLANK() throws RecognitionException {
        try {
            int _type = ISBLANK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:813:9: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'K' | 'k' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:813:11: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'K' | 'k' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISBLANK"

    // $ANTLR start "ISLITERAL"
    public final void mISLITERAL() throws RecognitionException {
        try {
            int _type = ISLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:815:11: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:815:13: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISLITERAL"

    // $ANTLR start "REGEX"
    public final void mREGEX() throws RecognitionException {
        try {
            int _type = REGEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:817:7: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:817:9: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REGEX"

    // $ANTLR start "SUBSTR"
    public final void mSUBSTR() throws RecognitionException {
        try {
            int _type = SUBSTR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:819:8: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:819:10: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'B' | 'b' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUBSTR"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:821:6: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:821:8: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:823:7: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:823:9: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "LOAD"
    public final void mLOAD() throws RecognitionException {
        try {
            int _type = LOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:825:6: ( ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'D' | 'd' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:825:8: ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOAD"

    // $ANTLR start "CLEAR"
    public final void mCLEAR() throws RecognitionException {
        try {
            int _type = CLEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:827:7: ( ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:827:9: ( 'C' | 'c' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLEAR"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:829:6: ( ( 'D' | 'd' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:829:8: ( 'D' | 'd' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "ADD"
    public final void mADD() throws RecognitionException {
        try {
            int _type = ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:831:5: ( ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'D' | 'd' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:831:7: ( 'A' | 'a' ) ( 'D' | 'd' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ADD"

    // $ANTLR start "MOVE"
    public final void mMOVE() throws RecognitionException {
        try {
            int _type = MOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:833:6: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:833:8: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'V' | 'v' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOVE"

    // $ANTLR start "COPY"
    public final void mCOPY() throws RecognitionException {
        try {
            int _type = COPY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:835:6: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'Y' | 'y' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:835:8: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'P' | 'p' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COPY"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:837:9: ( ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:837:11: ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:839:8: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:839:10: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:841:8: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:841:10: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "USING"
    public final void mUSING() throws RecognitionException {
        try {
            int _type = USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:843:7: ( ( 'U' | 'u' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:843:9: ( 'U' | 'u' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "USING"

    // $ANTLR start "SILENT"
    public final void mSILENT() throws RecognitionException {
        try {
            int _type = SILENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:845:8: ( ( 'S' | 's' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:845:10: ( 'S' | 's' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SILENT"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:847:9: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:847:11: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "ALL"
    public final void mALL() throws RecognitionException {
        try {
            int _type = ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:849:5: ( ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:849:7: ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALL"

    // $ANTLR start "DATA"
    public final void mDATA() throws RecognitionException {
        try {
            int _type = DATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:851:6: ( ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'A' | 'a' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:851:8: ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'A' | 'a' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATA"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:853:6: ( ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:853:8: ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:855:6: ( ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:855:8: ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:857:4: ( ( 'T' | 't' ) ( 'O' | 'o' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:857:6: ( 'T' | 't' ) ( 'O' | 'o' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:859:4: ( ( 'A' | 'a' ) ( 'S' | 's' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:859:6: ( 'A' | 'a' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:861:7: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:861:9: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "HAVING"
    public final void mHAVING() throws RecognitionException {
        try {
            int _type = HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:863:8: ( ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:863:10: ( 'H' | 'h' ) ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HAVING"

    // $ANTLR start "UNDEF"
    public final void mUNDEF() throws RecognitionException {
        try {
            int _type = UNDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:865:7: ( ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:865:9: ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNDEF"

    // $ANTLR start "BINDINGS"
    public final void mBINDINGS() throws RecognitionException {
        try {
            int _type = BINDINGS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:867:10: ( ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'S' | 's' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:867:12: ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BINDINGS"

    // $ANTLR start "SERVICE"
    public final void mSERVICE() throws RecognitionException {
        try {
            int _type = SERVICE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:869:9: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:869:11: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SERVICE"

    // $ANTLR start "BIND"
    public final void mBIND() throws RecognitionException {
        try {
            int _type = BIND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:871:6: ( ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:871:8: ( 'B' | 'b' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BIND"

    // $ANTLR start "MINUS_KEYWORD"
    public final void mMINUS_KEYWORD() throws RecognitionException {
        try {
            int _type = MINUS_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:873:15: ( ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:873:17: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS_KEYWORD"

    // $ANTLR start "IRI"
    public final void mIRI() throws RecognitionException {
        try {
            int _type = IRI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:875:5: ( ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:875:7: ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IRI"

    // $ANTLR start "URI"
    public final void mURI() throws RecognitionException {
        try {
            int _type = URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:877:5: ( ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:877:7: ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "URI"

    // $ANTLR start "BNODE"
    public final void mBNODE() throws RecognitionException {
        try {
            int _type = BNODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:879:7: ( ( 'B' | 'b' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:879:9: ( 'B' | 'b' ) ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BNODE"

    // $ANTLR start "RAND"
    public final void mRAND() throws RecognitionException {
        try {
            int _type = RAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:881:6: ( ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:881:8: ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RAND"

    // $ANTLR start "ABS"
    public final void mABS() throws RecognitionException {
        try {
            int _type = ABS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:883:4: ( ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:883:6: ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ABS"

    // $ANTLR start "CEIL"
    public final void mCEIL() throws RecognitionException {
        try {
            int _type = CEIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:885:6: ( ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'L' | 'l' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:885:8: ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'L' | 'l' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CEIL"

    // $ANTLR start "FLOOR"
    public final void mFLOOR() throws RecognitionException {
        try {
            int _type = FLOOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:887:7: ( ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:887:9: ( 'F' | 'f' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOOR"

    // $ANTLR start "ROUND"
    public final void mROUND() throws RecognitionException {
        try {
            int _type = ROUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:889:7: ( ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:889:9: ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ROUND"

    // $ANTLR start "CONCAT"
    public final void mCONCAT() throws RecognitionException {
        try {
            int _type = CONCAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:891:9: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:891:11: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONCAT"

    // $ANTLR start "STRLEN"
    public final void mSTRLEN() throws RecognitionException {
        try {
            int _type = STRLEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:893:8: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:893:10: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRLEN"

    // $ANTLR start "UCASE"
    public final void mUCASE() throws RecognitionException {
        try {
            int _type = UCASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:895:7: ( ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:895:9: ( 'U' | 'u' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UCASE"

    // $ANTLR start "LCASE"
    public final void mLCASE() throws RecognitionException {
        try {
            int _type = LCASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:897:7: ( ( 'L' | 'l' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:897:9: ( 'L' | 'l' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCASE"

    // $ANTLR start "ENCODE_FOR_URI"
    public final void mENCODE_FOR_URI() throws RecognitionException {
        try {
            int _type = ENCODE_FOR_URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:899:16: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) '_' ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) '_' ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:899:18: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) '_' ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) '_' ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'I' | 'i' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); if (state.failed) return ;
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); if (state.failed) return ;
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENCODE_FOR_URI"

    // $ANTLR start "CONTAINS"
    public final void mCONTAINS() throws RecognitionException {
        try {
            int _type = CONTAINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:901:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:901:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTAINS"

    // $ANTLR start "STRSTARTS"
    public final void mSTRSTARTS() throws RecognitionException {
        try {
            int _type = STRSTARTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:903:11: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:903:13: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRSTARTS"

    // $ANTLR start "STRENDS"
    public final void mSTRENDS() throws RecognitionException {
        try {
            int _type = STRENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:905:9: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:905:11: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRENDS"

    // $ANTLR start "STRBEFORE"
    public final void mSTRBEFORE() throws RecognitionException {
        try {
            int _type = STRBEFORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:907:11: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:907:13: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'B' | 'b' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'O' | 'o' ) ( 'R' | 'r' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRBEFORE"

    // $ANTLR start "STRAFTER"
    public final void mSTRAFTER() throws RecognitionException {
        try {
            int _type = STRAFTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:909:10: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'F' | 'f' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:909:12: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'F' | 'f' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRAFTER"

    // $ANTLR start "REPLACE"
    public final void mREPLACE() throws RecognitionException {
        try {
            int _type = REPLACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:911:9: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:911:11: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPLACE"

    // $ANTLR start "YEAR"
    public final void mYEAR() throws RecognitionException {
        try {
            int _type = YEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:913:6: ( ( 'Y' | 'y' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:913:8: ( 'Y' | 'y' ) ( 'E' | 'e' ) ( 'A' | 'a' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "YEAR"

    // $ANTLR start "MONTH"
    public final void mMONTH() throws RecognitionException {
        try {
            int _type = MONTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:915:7: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:915:9: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'H' | 'h' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MONTH"

    // $ANTLR start "DAY"
    public final void mDAY() throws RecognitionException {
        try {
            int _type = DAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:917:5: ( ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:917:7: ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DAY"

    // $ANTLR start "HOURS"
    public final void mHOURS() throws RecognitionException {
        try {
            int _type = HOURS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:919:7: ( ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'S' | 's' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:919:9: ( 'H' | 'h' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'R' | 'r' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HOURS"

    // $ANTLR start "MINUTES"
    public final void mMINUTES() throws RecognitionException {
        try {
            int _type = MINUTES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:921:9: ( ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'S' | 's' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:921:11: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUTES"

    // $ANTLR start "SECONDS"
    public final void mSECONDS() throws RecognitionException {
        try {
            int _type = SECONDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:923:9: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:923:11: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SECONDS"

    // $ANTLR start "TIMEZONE"
    public final void mTIMEZONE() throws RecognitionException {
        try {
            int _type = TIMEZONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:925:10: ( ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'Z' | 'z' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:925:13: ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'Z' | 'z' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMEZONE"

    // $ANTLR start "TZ"
    public final void mTZ() throws RecognitionException {
        try {
            int _type = TZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:927:4: ( ( 'T' | 't' ) ( 'Z' | 'z' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:927:6: ( 'T' | 't' ) ( 'Z' | 'z' )
            {
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TZ"

    // $ANTLR start "NOW"
    public final void mNOW() throws RecognitionException {
        try {
            int _type = NOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:929:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'W' | 'w' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:929:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'W' | 'w' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOW"

    // $ANTLR start "MD5"
    public final void mMD5() throws RecognitionException {
        try {
            int _type = MD5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:931:5: ( ( 'M' | 'm' ) ( 'D' | 'd' ) '5' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:931:7: ( 'M' | 'm' ) ( 'D' | 'd' ) '5'
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('5'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MD5"

    // $ANTLR start "SHA1"
    public final void mSHA1() throws RecognitionException {
        try {
            int _type = SHA1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:933:6: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '1' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:933:8: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '1'
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('1'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHA1"

    // $ANTLR start "SHA256"
    public final void mSHA256() throws RecognitionException {
        try {
            int _type = SHA256;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:935:8: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '256' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:935:10: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '256'
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("256"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHA256"

    // $ANTLR start "SHA384"
    public final void mSHA384() throws RecognitionException {
        try {
            int _type = SHA384;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:937:8: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '384' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:937:10: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '384'
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("384"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHA384"

    // $ANTLR start "SHA512"
    public final void mSHA512() throws RecognitionException {
        try {
            int _type = SHA512;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:939:8: ( ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '512' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:939:10: ( 'S' | 's' ) ( 'H' | 'h' ) ( 'A' | 'a' ) '512'
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match("512"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SHA512"

    // $ANTLR start "COALESCE"
    public final void mCOALESCE() throws RecognitionException {
        try {
            int _type = COALESCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:941:10: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:941:12: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COALESCE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:943:4: ( ( 'I' | 'i' ) ( 'F' | 'f' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:943:6: ( 'I' | 'i' ) ( 'F' | 'f' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "STRLANG"
    public final void mSTRLANG() throws RecognitionException {
        try {
            int _type = STRLANG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:945:9: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:945:11: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRLANG"

    // $ANTLR start "STRDT"
    public final void mSTRDT() throws RecognitionException {
        try {
            int _type = STRDT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:947:7: ( ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'T' | 't' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:947:9: ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRDT"

    // $ANTLR start "ISNUMERIC"
    public final void mISNUMERIC() throws RecognitionException {
        try {
            int _type = ISNUMERIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:949:11: ( ( 'I' | 'i' ) ( 'S' | 's' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:949:13: ( 'I' | 'i' ) ( 'S' | 's' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'C' | 'c' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISNUMERIC"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:951:7: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:951:9: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "SUM"
    public final void mSUM() throws RecognitionException {
        try {
            int _type = SUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:953:5: ( ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:953:7: ( 'S' | 's' ) ( 'U' | 'u' ) ( 'M' | 'm' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUM"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:955:5: ( ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:955:7: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MIN"

    // $ANTLR start "MAX"
    public final void mMAX() throws RecognitionException {
        try {
            int _type = MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:957:5: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:957:7: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'X' | 'x' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAX"

    // $ANTLR start "AVG"
    public final void mAVG() throws RecognitionException {
        try {
            int _type = AVG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:959:5: ( ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'G' | 'g' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:959:7: ( 'A' | 'a' ) ( 'V' | 'v' ) ( 'G' | 'g' )
            {
            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AVG"

    // $ANTLR start "SAMPLE"
    public final void mSAMPLE() throws RecognitionException {
        try {
            int _type = SAMPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:961:8: ( ( 'S' | 's' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'E' | 'e' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:961:10: ( 'S' | 's' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'P' | 'p' ) ( 'L' | 'l' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SAMPLE"

    // $ANTLR start "GROUP_CONCAT"
    public final void mGROUP_CONCAT() throws RecognitionException {
        try {
            int _type = GROUP_CONCAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:963:15: ( ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) '_' ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:963:18: ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'O' | 'o' ) ( 'U' | 'u' ) ( 'P' | 'p' ) '_' ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            match('_'); if (state.failed) return ;
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GROUP_CONCAT"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:965:5: ( ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:965:7: ( 'N' | 'n' ) ( 'O' | 'o' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:967:4: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:967:6: ( 'I' | 'i' ) ( 'N' | 'n' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:969:8: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:969:10: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'I' | 'i' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "SEPARATOR"
    public final void mSEPARATOR() throws RecognitionException {
        try {
            int _type = SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:971:11: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:971:13: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'R' | 'r' )
            {
            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEPARATOR"

    // $ANTLR start "PNAME_NS"
    public final void mPNAME_NS() throws RecognitionException {
        try {
            int _type = PNAME_NS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken p=null;

            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:973:10: ( (p= PN_PREFIX )? ':' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:973:12: (p= PN_PREFIX )? ':'
            {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:973:13: (p= PN_PREFIX )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')||(LA2_0>='\u00C0' && LA2_0<='\u00D6')||(LA2_0>='\u00D8' && LA2_0<='\u00F6')||(LA2_0>='\u00F8' && LA2_0<='\u02FF')||(LA2_0>='\u0370' && LA2_0<='\u037D')||(LA2_0>='\u037F' && LA2_0<='\u1FFF')||(LA2_0>='\u200C' && LA2_0<='\u200D')||(LA2_0>='\u2070' && LA2_0<='\u218F')||(LA2_0>='\u2C00' && LA2_0<='\u2FEF')||(LA2_0>='\u3001' && LA2_0<='\uD7FF')||(LA2_0>='\uF900' && LA2_0<='\uFDCF')||(LA2_0>='\uFDF0' && LA2_0<='\uFFFD')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:973:13: p= PN_PREFIX
                    {
                    int pStart3958 = getCharIndex();
                    mPN_PREFIX(); if (state.failed) return ;
                    p = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, pStart3958, getCharIndex()-1);

                    }
                    break;

            }

            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PNAME_NS"

    // $ANTLR start "PNAME_LN"
    public final void mPNAME_LN() throws RecognitionException {
        try {
            int _type = PNAME_LN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:975:10: ( PNAME_NS PN_LOCAL )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:975:12: PNAME_NS PN_LOCAL
            {
            mPNAME_NS(); if (state.failed) return ;
            mPN_LOCAL(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PNAME_LN"

    // $ANTLR start "BLANK_NODE_LABEL"
    public final void mBLANK_NODE_LABEL() throws RecognitionException {
        try {
            int _type = BLANK_NODE_LABEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:977:18: ( '_:' PN_LOCAL )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:977:20: '_:' PN_LOCAL
            {
            match("_:"); if (state.failed) return ;

            mPN_LOCAL(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BLANK_NODE_LABEL"

    // $ANTLR start "VAR1"
    public final void mVAR1() throws RecognitionException {
        try {
            int _type = VAR1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:979:6: ( '?' VARNAME )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:979:8: '?' VARNAME
            {
            match('?'); if (state.failed) return ;
            mVARNAME(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR1"

    // $ANTLR start "VAR2"
    public final void mVAR2() throws RecognitionException {
        try {
            int _type = VAR2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:981:6: ( '$' VARNAME )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:981:8: '$' VARNAME
            {
            match('$'); if (state.failed) return ;
            mVARNAME(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR2"

    // $ANTLR start "LANGTAG"
    public final void mLANGTAG() throws RecognitionException {
        try {
            int _type = LANGTAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:983:9: ( '@' ( 'A' .. 'Z' | 'a' .. 'z' )+ ( MINUS ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )+ )* )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:983:11: '@' ( 'A' .. 'Z' | 'a' .. 'z' )+ ( MINUS ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )+ )*
            {
            match('@'); if (state.failed) return ;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:983:15: ( 'A' .. 'Z' | 'a' .. 'z' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:983:36: ( MINUS ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )+ )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='-') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:983:37: MINUS ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )+
            	    {
            	    mMINUS(); if (state.failed) return ;
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:983:43: ( 'A' .. 'Z' | 'a' .. 'z' | DIGIT )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();
            	    	    state.failed=false;
            	    	    }
            	    	    else {
            	    	        if (state.backtracking>0) {state.failed=true; return ;}
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	    	    if (state.backtracking>0) {state.failed=true; return ;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LANGTAG"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:985:9: ( ( DIGIT )+ )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:985:11: ( DIGIT )+
            {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:985:11: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:985:11: DIGIT
            	    {
            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "DECIMAL"
    public final void mDECIMAL() throws RecognitionException {
        try {
            int _type = DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:988:5: ( ( DIGIT )+ DOT ( DIGIT )* | DOT ( DIGIT )+ )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                alt10=1;
            }
            else if ( (LA10_0=='.') ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:988:7: ( DIGIT )+ DOT ( DIGIT )*
                    {
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:988:7: ( DIGIT )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:988:7: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);

                    mDOT(); if (state.failed) return ;
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:988:18: ( DIGIT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:988:18: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:989:7: DOT ( DIGIT )+
                    {
                    mDOT(); if (state.failed) return ;
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:989:11: ( DIGIT )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:989:11: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:993:5: ( ( DIGIT )+ DOT ( DIGIT )* EXPONENT | DOT ( DIGIT )+ EXPONENT | ( DIGIT )+ EXPONENT )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:993:7: ( DIGIT )+ DOT ( DIGIT )* EXPONENT
                    {
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:993:7: ( DIGIT )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:993:7: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    mDOT(); if (state.failed) return ;
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:993:18: ( DIGIT )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:993:18: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    mEXPONENT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:994:7: DOT ( DIGIT )+ EXPONENT
                    {
                    mDOT(); if (state.failed) return ;
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:994:11: ( DIGIT )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:994:11: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    mEXPONENT(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:995:7: ( DIGIT )+ EXPONENT
                    {
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:995:7: ( DIGIT )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:995:7: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    mEXPONENT(); if (state.failed) return ;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "INTEGER_POSITIVE"
    public final void mINTEGER_POSITIVE() throws RecognitionException {
        try {
            int _type = INTEGER_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:998:18: ( PLUS INTEGER )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:998:20: PLUS INTEGER
            {
            mPLUS(); if (state.failed) return ;
            mINTEGER(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER_POSITIVE"

    // $ANTLR start "DECIMAL_POSITIVE"
    public final void mDECIMAL_POSITIVE() throws RecognitionException {
        try {
            int _type = DECIMAL_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1000:18: ( PLUS DECIMAL )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1000:20: PLUS DECIMAL
            {
            mPLUS(); if (state.failed) return ;
            mDECIMAL(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_POSITIVE"

    // $ANTLR start "DOUBLE_POSITIVE"
    public final void mDOUBLE_POSITIVE() throws RecognitionException {
        try {
            int _type = DOUBLE_POSITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1002:17: ( PLUS DOUBLE )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1002:19: PLUS DOUBLE
            {
            mPLUS(); if (state.failed) return ;
            mDOUBLE(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_POSITIVE"

    // $ANTLR start "INTEGER_NEGATIVE"
    public final void mINTEGER_NEGATIVE() throws RecognitionException {
        try {
            int _type = INTEGER_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1004:18: ( MINUS INTEGER )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1004:20: MINUS INTEGER
            {
            mMINUS(); if (state.failed) return ;
            mINTEGER(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER_NEGATIVE"

    // $ANTLR start "DECIMAL_NEGATIVE"
    public final void mDECIMAL_NEGATIVE() throws RecognitionException {
        try {
            int _type = DECIMAL_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1006:18: ( MINUS DECIMAL )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1006:20: MINUS DECIMAL
            {
            mMINUS(); if (state.failed) return ;
            mDECIMAL(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_NEGATIVE"

    // $ANTLR start "DOUBLE_NEGATIVE"
    public final void mDOUBLE_NEGATIVE() throws RecognitionException {
        try {
            int _type = DOUBLE_NEGATIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1008:17: ( MINUS DOUBLE )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1008:19: MINUS DOUBLE
            {
            mMINUS(); if (state.failed) return ;
            mDOUBLE(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_NEGATIVE"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1011:10: ( ( 'e' | 'E' ) ( SIGN )? ( DIGIT )+ )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1011:12: ( 'e' | 'E' ) ( SIGN )? ( DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1011:22: ( SIGN )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1011:22: SIGN
                    {
                    mSIGN(); if (state.failed) return ;

                    }
                    break;

            }

            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1011:28: ( DIGIT )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1011:28: DIGIT
            	    {
            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "STRING_LITERAL1"
    public final void mSTRING_LITERAL1() throws RecognitionException {
        try {
            int _type = STRING_LITERAL1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1013:17: ( '\\'' ( options {greedy=false; } : ~ ( '\\'' | '\\\\' | EOL ) | ECHAR )* '\\'' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1013:19: '\\'' ( options {greedy=false; } : ~ ( '\\'' | '\\\\' | EOL ) | ECHAR )* '\\''
            {
            match('\''); if (state.failed) return ;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1013:24: ( options {greedy=false; } : ~ ( '\\'' | '\\\\' | EOL ) | ECHAR )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }
                else if ( (LA18_0=='\\') ) {
                    alt18=2;
                }
                else if ( (LA18_0=='\'') ) {
                    alt18=3;
                }


                switch (alt18) {
            	case 1 :
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1013:51: ~ ( '\\'' | '\\\\' | EOL )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1013:74: ECHAR
            	    {
            	    mECHAR(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match('\''); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL1"

    // $ANTLR start "STRING_LITERAL2"
    public final void mSTRING_LITERAL2() throws RecognitionException {
        try {
            int _type = STRING_LITERAL2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1015:17: ( '\"' ( options {greedy=false; } : ~ ( '\"' | '\\\\' | EOL ) | ECHAR )* '\"' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1015:19: '\"' ( options {greedy=false; } : ~ ( '\"' | '\\\\' | EOL ) | ECHAR )* '\"'
            {
            match('\"'); if (state.failed) return ;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1015:23: ( options {greedy=false; } : ~ ( '\"' | '\\\\' | EOL ) | ECHAR )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='!')||(LA19_0>='#' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }
                else if ( (LA19_0=='\\') ) {
                    alt19=2;
                }
                else if ( (LA19_0=='\"') ) {
                    alt19=3;
                }


                switch (alt19) {
            	case 1 :
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1015:50: ~ ( '\"' | '\\\\' | EOL )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1015:72: ECHAR
            	    {
            	    mECHAR(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match('\"'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL2"

    // $ANTLR start "STRING_LITERAL_LONG1"
    public final void mSTRING_LITERAL_LONG1() throws RecognitionException {
        try {
            int _type = STRING_LITERAL_LONG1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1017:22: ( '\\'\\'\\'' ( options {greedy=false; } : ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\'' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1017:24: '\\'\\'\\'' ( options {greedy=false; } : ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )* '\\'\\'\\''
            {
            match("'''"); if (state.failed) return ;

            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1017:33: ( options {greedy=false; } : ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\'') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='\'') ) {
                        int LA22_3 = input.LA(3);

                        if ( (LA22_3=='\'') ) {
                            alt22=2;
                        }
                        else if ( ((LA22_3>='\u0000' && LA22_3<='&')||(LA22_3>='(' && LA22_3<='\uFFFF')) ) {
                            alt22=1;
                        }


                    }
                    else if ( ((LA22_1>='\u0000' && LA22_1<='&')||(LA22_1>='(' && LA22_1<='\uFFFF')) ) {
                        alt22=1;
                    }


                }
                else if ( ((LA22_0>='\u0000' && LA22_0<='&')||(LA22_0>='(' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1017:60: ( '\\'' | '\\'\\'' )? (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    {
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1017:60: ( '\\'' | '\\'\\'' )?
            	    int alt20=3;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0=='\'') ) {
            	        int LA20_1 = input.LA(2);

            	        if ( (LA20_1=='\'') ) {
            	            alt20=2;
            	        }
            	        else if ( ((LA20_1>='\u0000' && LA20_1<='&')||(LA20_1>='(' && LA20_1<='\uFFFF')) ) {
            	            alt20=1;
            	        }
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1017:61: '\\''
            	            {
            	            match('\''); if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1017:68: '\\'\\''
            	            {
            	            match("''"); if (state.failed) return ;


            	            }
            	            break;

            	    }

            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1017:77: (~ ( '\\'' | '\\\\' ) | ECHAR )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0=='\\') ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1017:78: ~ ( '\\'' | '\\\\' )
            	            {
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	                input.consume();
            	            state.failed=false;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return ;}
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1017:93: ECHAR
            	            {
            	            mECHAR(); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match("'''"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL_LONG1"

    // $ANTLR start "STRING_LITERAL_LONG2"
    public final void mSTRING_LITERAL_LONG2() throws RecognitionException {
        try {
            int _type = STRING_LITERAL_LONG2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1019:22: ( '\"\"\"' ( options {greedy=false; } : ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1019:24: '\"\"\"' ( options {greedy=false; } : ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )* '\"\"\"'
            {
            match("\"\"\""); if (state.failed) return ;

            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1019:30: ( options {greedy=false; } : ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\"') ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1=='\"') ) {
                        int LA25_3 = input.LA(3);

                        if ( (LA25_3=='\"') ) {
                            alt25=2;
                        }
                        else if ( ((LA25_3>='\u0000' && LA25_3<='!')||(LA25_3>='#' && LA25_3<='\uFFFF')) ) {
                            alt25=1;
                        }


                    }
                    else if ( ((LA25_1>='\u0000' && LA25_1<='!')||(LA25_1>='#' && LA25_1<='\uFFFF')) ) {
                        alt25=1;
                    }


                }
                else if ( ((LA25_0>='\u0000' && LA25_0<='!')||(LA25_0>='#' && LA25_0<='\uFFFF')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1019:57: ( '\"' | '\"\"' )? (~ ( '\"' | '\\\\' ) | ECHAR )
            	    {
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1019:57: ( '\"' | '\"\"' )?
            	    int alt23=3;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0=='\"') ) {
            	        int LA23_1 = input.LA(2);

            	        if ( (LA23_1=='\"') ) {
            	            alt23=2;
            	        }
            	        else if ( ((LA23_1>='\u0000' && LA23_1<='!')||(LA23_1>='#' && LA23_1<='\uFFFF')) ) {
            	            alt23=1;
            	        }
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1019:58: '\"'
            	            {
            	            match('\"'); if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1019:64: '\"\"'
            	            {
            	            match("\"\""); if (state.failed) return ;


            	            }
            	            break;

            	    }

            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1019:71: (~ ( '\"' | '\\\\' ) | ECHAR )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( ((LA24_0>='\u0000' && LA24_0<='!')||(LA24_0>='#' && LA24_0<='[')||(LA24_0>=']' && LA24_0<='\uFFFF')) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0=='\\') ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1019:72: ~ ( '\"' | '\\\\' )
            	            {
            	            if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	                input.consume();
            	            state.failed=false;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return ;}
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1019:86: ECHAR
            	            {
            	            mECHAR(); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match("\"\"\""); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL_LONG2"

    // $ANTLR start "ECHAR"
    public final void mECHAR() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1022:7: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1022:9: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' )
            {
            match('\\'); if (state.failed) return ;
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ECHAR"

    // $ANTLR start "IRI_REF"
    public final void mIRI_REF() throws RecognitionException {
        try {
            int _type = IRI_REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1025:5: ( ( '<' ( options {greedy=false; } : IRI_REF_CHARACTERS )* '>' )=> '<' ( options {greedy=false; } : IRI_REF_CHARACTERS )* '>' | LESS )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='<') ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1=='!'||(LA27_1>='#' && LA27_1<=';')||LA27_1=='='||(LA27_1>='?' && LA27_1<='[')||LA27_1==']'||LA27_1=='_'||(LA27_1>='a' && LA27_1<='z')||(LA27_1>='~' && LA27_1<='\uFFFF')) && (synpred1_Sparql())) {
                    alt27=1;
                }
                else if ( (LA27_1=='>') && (synpred1_Sparql())) {
                    alt27=1;
                }
                else {
                    alt27=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1025:6: ( '<' ( options {greedy=false; } : IRI_REF_CHARACTERS )* '>' )=> '<' ( options {greedy=false; } : IRI_REF_CHARACTERS )* '>'
                    {
                    match('<'); if (state.failed) return ;
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1025:70: ( options {greedy=false; } : IRI_REF_CHARACTERS )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0=='!'||(LA26_0>='#' && LA26_0<=';')||LA26_0=='='||(LA26_0>='?' && LA26_0<='[')||LA26_0==']'||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')||(LA26_0>='~' && LA26_0<='\uFFFF')) ) {
                            alt26=1;
                        }
                        else if ( (LA26_0=='>') ) {
                            alt26=2;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1025:95: IRI_REF_CHARACTERS
                    	    {
                    	    mIRI_REF_CHARACTERS(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match('>'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1026:7: LESS
                    {
                    mLESS(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       _type = LESS; 
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IRI_REF"

    // $ANTLR start "IRI_REF_CHARACTERS"
    public final void mIRI_REF_CHARACTERS() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1031:5: (~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | PIPE | INVERSE | '`' | '\\\\' | '\\u0000' | '\\u0001' | '\\u0002' | '\\u0003' | '\\u0004' | '\\u0005' | '\\u0006' | '\\u0007' | '\\u0008' | '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u000E' | '\\u000F' | '\\u0010' | '\\u0011' | '\\u0012' | '\\u0013' | '\\u0014' | '\\u0015' | '\\u0016' | '\\u0017' | '\\u0018' | '\\u0019' | '\\u001A' | '\\u001B' | '\\u001C' | '\\u001D' | '\\u001E' | '\\u001F' | '\\u0020' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1031:8: ~ ( '<' | '>' | '\"' | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | PIPE | INVERSE | '`' | '\\\\' | '\\u0000' | '\\u0001' | '\\u0002' | '\\u0003' | '\\u0004' | '\\u0005' | '\\u0006' | '\\u0007' | '\\u0008' | '\\u0009' | '\\u000A' | '\\u000B' | '\\u000C' | '\\u000D' | '\\u000E' | '\\u000F' | '\\u0010' | '\\u0011' | '\\u0012' | '\\u0013' | '\\u0014' | '\\u0015' | '\\u0016' | '\\u0017' | '\\u0018' | '\\u0019' | '\\u001A' | '\\u001B' | '\\u001C' | '\\u001D' | '\\u001E' | '\\u001F' | '\\u0020' )
            {
            if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<=';')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='[')||input.LA(1)==']'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "IRI_REF_CHARACTERS"

    // $ANTLR start "PN_CHARS_U"
    public final void mPN_CHARS_U() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1035:12: ( PN_CHARS_BASE | '_' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_CHARS_U"

    // $ANTLR start "VARNAME"
    public final void mVARNAME() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1038:9: ( ( PN_CHARS_U | DIGIT ) ( PN_CHARS_U | DIGIT | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )* )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1038:11: ( PN_CHARS_U | DIGIT ) ( PN_CHARS_U | DIGIT | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1038:32: ( PN_CHARS_U | DIGIT | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='0' && LA28_0<='9')||(LA28_0>='A' && LA28_0<='Z')||LA28_0=='_'||(LA28_0>='a' && LA28_0<='z')||LA28_0=='\u00B7'||(LA28_0>='\u00C0' && LA28_0<='\u00D6')||(LA28_0>='\u00D8' && LA28_0<='\u00F6')||(LA28_0>='\u00F8' && LA28_0<='\u037D')||(LA28_0>='\u037F' && LA28_0<='\u1FFF')||(LA28_0>='\u200C' && LA28_0<='\u200D')||(LA28_0>='\u203F' && LA28_0<='\u2040')||(LA28_0>='\u2070' && LA28_0<='\u218F')||(LA28_0>='\u2C00' && LA28_0<='\u2FEF')||(LA28_0>='\u3001' && LA28_0<='\uD7FF')||(LA28_0>='\uF900' && LA28_0<='\uFDCF')||(LA28_0>='\uFDF0' && LA28_0<='\uFFFD')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "VARNAME"

    // $ANTLR start "PN_CHARS"
    public final void mPN_CHARS() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1042:5: ( PN_CHARS_U | MINUS | DIGIT | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_CHARS"

    // $ANTLR start "PN_PREFIX"
    public final void mPN_PREFIX() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1051:11: ( PN_CHARS_BASE ( ( PN_CHARS | DOT )* PN_CHARS )? )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1051:13: PN_CHARS_BASE ( ( PN_CHARS | DOT )* PN_CHARS )?
            {
            mPN_CHARS_BASE(); if (state.failed) return ;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1051:27: ( ( PN_CHARS | DOT )* PN_CHARS )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>='-' && LA30_0<='.')||(LA30_0>='0' && LA30_0<='9')||(LA30_0>='A' && LA30_0<='Z')||LA30_0=='_'||(LA30_0>='a' && LA30_0<='z')||LA30_0=='\u00B7'||(LA30_0>='\u00C0' && LA30_0<='\u00D6')||(LA30_0>='\u00D8' && LA30_0<='\u00F6')||(LA30_0>='\u00F8' && LA30_0<='\u037D')||(LA30_0>='\u037F' && LA30_0<='\u1FFF')||(LA30_0>='\u200C' && LA30_0<='\u200D')||(LA30_0>='\u203F' && LA30_0<='\u2040')||(LA30_0>='\u2070' && LA30_0<='\u218F')||(LA30_0>='\u2C00' && LA30_0<='\u2FEF')||(LA30_0>='\u3001' && LA30_0<='\uD7FF')||(LA30_0>='\uF900' && LA30_0<='\uFDCF')||(LA30_0>='\uFDF0' && LA30_0<='\uFFFD')) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1051:28: ( PN_CHARS | DOT )* PN_CHARS
                    {
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1051:28: ( PN_CHARS | DOT )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0=='-'||(LA29_0>='0' && LA29_0<='9')||(LA29_0>='A' && LA29_0<='Z')||LA29_0=='_'||(LA29_0>='a' && LA29_0<='z')||LA29_0=='\u00B7'||(LA29_0>='\u00C0' && LA29_0<='\u00D6')||(LA29_0>='\u00D8' && LA29_0<='\u00F6')||(LA29_0>='\u00F8' && LA29_0<='\u037D')||(LA29_0>='\u037F' && LA29_0<='\u1FFF')||(LA29_0>='\u200C' && LA29_0<='\u200D')||(LA29_0>='\u203F' && LA29_0<='\u2040')||(LA29_0>='\u2070' && LA29_0<='\u218F')||(LA29_0>='\u2C00' && LA29_0<='\u2FEF')||(LA29_0>='\u3001' && LA29_0<='\uD7FF')||(LA29_0>='\uF900' && LA29_0<='\uFDCF')||(LA29_0>='\uFDF0' && LA29_0<='\uFFFD')) ) {
                            int LA29_1 = input.LA(2);

                            if ( ((LA29_1>='-' && LA29_1<='.')||(LA29_1>='0' && LA29_1<='9')||(LA29_1>='A' && LA29_1<='Z')||LA29_1=='_'||(LA29_1>='a' && LA29_1<='z')||LA29_1=='\u00B7'||(LA29_1>='\u00C0' && LA29_1<='\u00D6')||(LA29_1>='\u00D8' && LA29_1<='\u00F6')||(LA29_1>='\u00F8' && LA29_1<='\u037D')||(LA29_1>='\u037F' && LA29_1<='\u1FFF')||(LA29_1>='\u200C' && LA29_1<='\u200D')||(LA29_1>='\u203F' && LA29_1<='\u2040')||(LA29_1>='\u2070' && LA29_1<='\u218F')||(LA29_1>='\u2C00' && LA29_1<='\u2FEF')||(LA29_1>='\u3001' && LA29_1<='\uD7FF')||(LA29_1>='\uF900' && LA29_1<='\uFDCF')||(LA29_1>='\uFDF0' && LA29_1<='\uFFFD')) ) {
                                alt29=1;
                            }


                        }
                        else if ( (LA29_0=='.') ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:
                    	    {
                    	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    mPN_CHARS(); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_PREFIX"

    // $ANTLR start "PN_LOCAL"
    public final void mPN_LOCAL() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1054:10: ( ( PN_CHARS_U | DIGIT | PLX ) ( ( PN_CHARS | DOT | PLX )* ( PN_CHARS | PLX ) )? )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1054:12: ( PN_CHARS_U | DIGIT | PLX ) ( ( PN_CHARS | DOT | PLX )* ( PN_CHARS | PLX ) )?
            {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1054:12: ( PN_CHARS_U | DIGIT | PLX )
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>='A' && LA31_0<='Z')||LA31_0=='_'||(LA31_0>='a' && LA31_0<='z')||(LA31_0>='\u00C0' && LA31_0<='\u00D6')||(LA31_0>='\u00D8' && LA31_0<='\u00F6')||(LA31_0>='\u00F8' && LA31_0<='\u02FF')||(LA31_0>='\u0370' && LA31_0<='\u037D')||(LA31_0>='\u037F' && LA31_0<='\u1FFF')||(LA31_0>='\u200C' && LA31_0<='\u200D')||(LA31_0>='\u2070' && LA31_0<='\u218F')||(LA31_0>='\u2C00' && LA31_0<='\u2FEF')||(LA31_0>='\u3001' && LA31_0<='\uD7FF')||(LA31_0>='\uF900' && LA31_0<='\uFDCF')||(LA31_0>='\uFDF0' && LA31_0<='\uFFFD')) ) {
                alt31=1;
            }
            else if ( ((LA31_0>='0' && LA31_0<='9')) ) {
                alt31=2;
            }
            else if ( (LA31_0=='%'||LA31_0=='\\') ) {
                alt31=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1054:13: PN_CHARS_U
                    {
                    mPN_CHARS_U(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1054:24: DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1054:30: PLX
                    {
                    mPLX(); if (state.failed) return ;

                    }
                    break;

            }

            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1054:36: ( ( PN_CHARS | DOT | PLX )* ( PN_CHARS | PLX ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='%'||(LA34_0>='-' && LA34_0<='.')||(LA34_0>='0' && LA34_0<='9')||(LA34_0>='A' && LA34_0<='Z')||LA34_0=='\\'||LA34_0=='_'||(LA34_0>='a' && LA34_0<='z')||LA34_0=='\u00B7'||(LA34_0>='\u00C0' && LA34_0<='\u00D6')||(LA34_0>='\u00D8' && LA34_0<='\u00F6')||(LA34_0>='\u00F8' && LA34_0<='\u037D')||(LA34_0>='\u037F' && LA34_0<='\u1FFF')||(LA34_0>='\u200C' && LA34_0<='\u200D')||(LA34_0>='\u203F' && LA34_0<='\u2040')||(LA34_0>='\u2070' && LA34_0<='\u218F')||(LA34_0>='\u2C00' && LA34_0<='\u2FEF')||(LA34_0>='\u3001' && LA34_0<='\uD7FF')||(LA34_0>='\uF900' && LA34_0<='\uFDCF')||(LA34_0>='\uFDF0' && LA34_0<='\uFFFD')) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1054:37: ( PN_CHARS | DOT | PLX )* ( PN_CHARS | PLX )
                    {
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1054:37: ( PN_CHARS | DOT | PLX )*
                    loop32:
                    do {
                        int alt32=4;
                        alt32 = dfa32.predict(input);
                        switch (alt32) {
                    	case 1 :
                    	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1054:38: PN_CHARS
                    	    {
                    	    mPN_CHARS(); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1054:47: DOT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	          
                    	                          	                       if (input.LA(1)=='.') {
                    	                          	                          int LA2 = input.LA(2);
                    	                          	       	                  if (!((LA2>='-' && LA2<='.')||(LA2>='0' && LA2<='9')||(LA2>='A' && LA2<='Z')||LA2=='_'||(LA2>='a' && LA2<='z')||LA2=='\u00B7'||(LA2>='\u00C0' && LA2<='\u00D6')||(LA2>='\u00D8' && LA2<='\u00F6')||(LA2>='\u00F8' && LA2<='\u037D')||(LA2>='\u037F' && LA2<='\u1FFF')||(LA2>='\u200C' && LA2<='\u200D')||(LA2>='\u203F' && LA2<='\u2040')||(LA2>='\u2070' && LA2<='\u218F')||(LA2>='\u2C00' && LA2<='\u2FEF')||(LA2>='\u3001' && LA2<='\uD7FF')||(LA2>='\uF900' && LA2<='\uFDCF')||(LA2>='\uFDF0' && LA2<='\uFFFD'))) {
                    	                          	       	                     return;
                    	                          	       	                  }
                    	                          	                       }
                    	                                                 
                    	    }
                    	    mDOT(); if (state.failed) return ;

                    	    }
                    	    break;
                    	case 3 :
                    	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1061:51: PLX
                    	    {
                    	    mPLX(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1061:57: ( PN_CHARS | PLX )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0=='-'||(LA33_0>='0' && LA33_0<='9')||(LA33_0>='A' && LA33_0<='Z')||LA33_0=='_'||(LA33_0>='a' && LA33_0<='z')||LA33_0=='\u00B7'||(LA33_0>='\u00C0' && LA33_0<='\u00D6')||(LA33_0>='\u00D8' && LA33_0<='\u00F6')||(LA33_0>='\u00F8' && LA33_0<='\u037D')||(LA33_0>='\u037F' && LA33_0<='\u1FFF')||(LA33_0>='\u200C' && LA33_0<='\u200D')||(LA33_0>='\u203F' && LA33_0<='\u2040')||(LA33_0>='\u2070' && LA33_0<='\u218F')||(LA33_0>='\u2C00' && LA33_0<='\u2FEF')||(LA33_0>='\u3001' && LA33_0<='\uD7FF')||(LA33_0>='\uF900' && LA33_0<='\uFDCF')||(LA33_0>='\uFDF0' && LA33_0<='\uFFFD')) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0=='%'||LA33_0=='\\') ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1061:58: PN_CHARS
                            {
                            mPN_CHARS(); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1061:67: PLX
                            {
                            mPLX(); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_LOCAL"

    // $ANTLR start "PN_CHARS_BASE"
    public final void mPN_CHARS_BASE() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1065:5: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_CHARS_BASE"

    // $ANTLR start "PLX"
    public final void mPLX() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1081:5: ( PERCENT | PN_LOCAL_ESC )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='%') ) {
                alt35=1;
            }
            else if ( (LA35_0=='\\') ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1081:7: PERCENT
                    {
                    mPERCENT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1081:17: PN_LOCAL_ESC
                    {
                    mPN_LOCAL_ESC(); if (state.failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "PLX"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1084:9: ( '%' HEX HEX )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1084:11: '%' HEX HEX
            {
            match('%'); if (state.failed) return ;
            mHEX(); if (state.failed) return ;
            mHEX(); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1087:5: ( DIGIT | 'A' .. 'F' | 'a' .. 'z' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "PN_LOCAL_ESC"
    public final void mPN_LOCAL_ESC() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1090:14: ( '\\\\' ( '_' | '~' | '.' | '-' | '!' | '$' | '&' | '\\'' | '(' | ')' | '*' | '+' | ',' | ';' | '=' | ':' | '/' | '?' | '#' | '@' | '%' ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1090:16: '\\\\' ( '_' | '~' | '.' | '-' | '!' | '$' | '&' | '\\'' | '(' | ')' | '*' | '+' | ',' | ';' | '=' | ':' | '/' | '?' | '#' | '@' | '%' )
            {
            match('\\'); if (state.failed) return ;
            if ( input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<=';')||input.LA(1)=='='||(input.LA(1)>='?' && input.LA(1)<='@')||input.LA(1)=='_'||input.LA(1)=='~' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "PN_LOCAL_ESC"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1093:7: ( '0' .. '9' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1093:9: '0' .. '9'
            {
            matchRange('0','9'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1095:9: ( '#' ( options {greedy=false; } : . )* EOL )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1095:11: '#' ( options {greedy=false; } : . )* EOL
            {
            match('#'); if (state.failed) return ;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1095:15: ( options {greedy=false; } : . )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0=='\n'||LA36_0=='\r') ) {
                    alt36=2;
                }
                else if ( ((LA36_0>='\u0000' && LA36_0<='\t')||(LA36_0>='\u000B' && LA36_0<='\f')||(LA36_0>='\u000E' && LA36_0<='\uFFFF')) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1095:41: .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            mEOL(); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               _channel=HIDDEN; 
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "EOL"
    public final void mEOL() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1098:5: ( '\\n' | '\\r' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "EOL"

    // $ANTLR start "REFERENCE"
    public final void mREFERENCE() throws RecognitionException {
        try {
            int _type = REFERENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1100:11: ( '^^' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1100:13: '^^'
            {
            match("^^"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REFERENCE"

    // $ANTLR start "LESS_EQUAL"
    public final void mLESS_EQUAL() throws RecognitionException {
        try {
            int _type = LESS_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1102:12: ( '<=' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1102:14: '<='
            {
            match("<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_EQUAL"

    // $ANTLR start "GREATER_EQUAL"
    public final void mGREATER_EQUAL() throws RecognitionException {
        try {
            int _type = GREATER_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1104:15: ( '>=' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1104:17: '>='
            {
            match(">="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_EQUAL"

    // $ANTLR start "NOT_EQUAL"
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1106:11: ( '!=' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1106:13: '!='
            {
            match("!="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUAL"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1108:5: ( '&&' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1108:7: '&&'
            {
            match("&&"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1110:4: ( '||' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1110:6: '||'
            {
            match("||"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "INVERSE"
    public final void mINVERSE() throws RecognitionException {
        try {
            int _type = INVERSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1112:9: ( '^' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1112:11: '^'
            {
            match('^'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INVERSE"

    // $ANTLR start "OPEN_BRACE"
    public final void mOPEN_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1114:12: ( '(' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1114:14: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_BRACE"

    // $ANTLR start "CLOSE_BRACE"
    public final void mCLOSE_BRACE() throws RecognitionException {
        try {
            int _type = CLOSE_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1116:13: ( ')' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1116:15: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_BRACE"

    // $ANTLR start "OPEN_CURLY_BRACE"
    public final void mOPEN_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = OPEN_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1118:18: ( '{' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1118:20: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_CURLY_BRACE"

    // $ANTLR start "CLOSE_CURLY_BRACE"
    public final void mCLOSE_CURLY_BRACE() throws RecognitionException {
        try {
            int _type = CLOSE_CURLY_BRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1120:19: ( '}' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1120:21: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_CURLY_BRACE"

    // $ANTLR start "OPEN_SQUARE_BRACKET"
    public final void mOPEN_SQUARE_BRACKET() throws RecognitionException {
        try {
            int _type = OPEN_SQUARE_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1122:21: ( '[' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1122:23: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_SQUARE_BRACKET"

    // $ANTLR start "CLOSE_SQUARE_BRACKET"
    public final void mCLOSE_SQUARE_BRACKET() throws RecognitionException {
        try {
            int _type = CLOSE_SQUARE_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1124:22: ( ']' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1124:24: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_SQUARE_BRACKET"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1126:11: ( ';' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1126:13: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1128:5: ( '.' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1128:7: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1130:6: ( '+' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1130:8: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1132:7: ( '-' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1132:9: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "SIGN"
    public final void mSIGN() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1135:6: ( ( PLUS | MINUS ) )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1135:8: ( PLUS | MINUS )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SIGN"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1137:10: ( '*' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1137:12: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "QUESTION_MARK"
    public final void mQUESTION_MARK() throws RecognitionException {
        try {
            int _type = QUESTION_MARK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1139:15: ( '?' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1139:17: '?'
            {
            match('?'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUESTION_MARK"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1141:7: ( ',' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1141:9: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "NEGATION"
    public final void mNEGATION() throws RecognitionException {
        try {
            int _type = NEGATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1143:10: ( '!' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1143:12: '!'
            {
            match('!'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEGATION"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1145:8: ( '/' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1145:10: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1147:7: ( '=' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1147:9: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1150:6: ( '<' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1150:8: '<'
            {
            match('<'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1152:9: ( '>' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1152:11: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "PIPE"
    public final void mPIPE() throws RecognitionException {
        try {
            int _type = PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1154:6: ( '|' )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1154:8: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PIPE"

    // $ANTLR start "ANY"
    public final void mANY() throws RecognitionException {
        try {
            int _type = ANY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1156:5: ( . )
            // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1156:7: .
            {
            matchAny(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ANY"

    public void mTokens() throws RecognitionException {
        // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:8: ( WS | BASE | PREFIX | SELECT | DISTINCT | REDUCED | CONSTRUCT | DESCRIBE | ASK | FROM | NAMED | WHERE | ORDER | BY | ASC | DESC | LIMIT | OFFSET | OPTIONAL | GRAPH | UNION | FILTER | A | STR | LANG | LANGMATCHES | DATATYPE | BOUND | SAMETERM | ISIRI | ISURI | ISBLANK | ISLITERAL | REGEX | SUBSTR | TRUE | FALSE | LOAD | CLEAR | DROP | ADD | MOVE | COPY | CREATE | DELETE | INSERT | USING | SILENT | DEFAULT | ALL | DATA | WITH | INTO | TO | AS | GROUP | HAVING | UNDEF | BINDINGS | SERVICE | BIND | MINUS_KEYWORD | IRI | URI | BNODE | RAND | ABS | CEIL | FLOOR | ROUND | CONCAT | STRLEN | UCASE | LCASE | ENCODE_FOR_URI | CONTAINS | STRSTARTS | STRENDS | STRBEFORE | STRAFTER | REPLACE | YEAR | MONTH | DAY | HOURS | MINUTES | SECONDS | TIMEZONE | TZ | NOW | MD5 | SHA1 | SHA256 | SHA384 | SHA512 | COALESCE | IF | STRLANG | STRDT | ISNUMERIC | COUNT | SUM | MIN | MAX | AVG | SAMPLE | GROUP_CONCAT | NOT | IN | EXISTS | SEPARATOR | PNAME_NS | PNAME_LN | BLANK_NODE_LABEL | VAR1 | VAR2 | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | IRI_REF | COMMENT | REFERENCE | LESS_EQUAL | GREATER_EQUAL | NOT_EQUAL | AND | OR | INVERSE | OPEN_BRACE | CLOSE_BRACE | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | OPEN_SQUARE_BRACKET | CLOSE_SQUARE_BRACKET | SEMICOLON | DOT | PLUS | MINUS | ASTERISK | QUESTION_MARK | COMMA | NEGATION | DIVIDE | EQUAL | GREATER | PIPE | ANY )
        int alt37=158;
        alt37 = dfa37.predict(input);
        switch (alt37) {
            case 1 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:10: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 2 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:13: BASE
                {
                mBASE(); if (state.failed) return ;

                }
                break;
            case 3 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:18: PREFIX
                {
                mPREFIX(); if (state.failed) return ;

                }
                break;
            case 4 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:25: SELECT
                {
                mSELECT(); if (state.failed) return ;

                }
                break;
            case 5 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:32: DISTINCT
                {
                mDISTINCT(); if (state.failed) return ;

                }
                break;
            case 6 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:41: REDUCED
                {
                mREDUCED(); if (state.failed) return ;

                }
                break;
            case 7 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:49: CONSTRUCT
                {
                mCONSTRUCT(); if (state.failed) return ;

                }
                break;
            case 8 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:59: DESCRIBE
                {
                mDESCRIBE(); if (state.failed) return ;

                }
                break;
            case 9 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:68: ASK
                {
                mASK(); if (state.failed) return ;

                }
                break;
            case 10 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:72: FROM
                {
                mFROM(); if (state.failed) return ;

                }
                break;
            case 11 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:77: NAMED
                {
                mNAMED(); if (state.failed) return ;

                }
                break;
            case 12 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:83: WHERE
                {
                mWHERE(); if (state.failed) return ;

                }
                break;
            case 13 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:89: ORDER
                {
                mORDER(); if (state.failed) return ;

                }
                break;
            case 14 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:95: BY
                {
                mBY(); if (state.failed) return ;

                }
                break;
            case 15 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:98: ASC
                {
                mASC(); if (state.failed) return ;

                }
                break;
            case 16 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:102: DESC
                {
                mDESC(); if (state.failed) return ;

                }
                break;
            case 17 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:107: LIMIT
                {
                mLIMIT(); if (state.failed) return ;

                }
                break;
            case 18 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:113: OFFSET
                {
                mOFFSET(); if (state.failed) return ;

                }
                break;
            case 19 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:120: OPTIONAL
                {
                mOPTIONAL(); if (state.failed) return ;

                }
                break;
            case 20 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:129: GRAPH
                {
                mGRAPH(); if (state.failed) return ;

                }
                break;
            case 21 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:135: UNION
                {
                mUNION(); if (state.failed) return ;

                }
                break;
            case 22 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:141: FILTER
                {
                mFILTER(); if (state.failed) return ;

                }
                break;
            case 23 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:148: A
                {
                mA(); if (state.failed) return ;

                }
                break;
            case 24 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:150: STR
                {
                mSTR(); if (state.failed) return ;

                }
                break;
            case 25 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:154: LANG
                {
                mLANG(); if (state.failed) return ;

                }
                break;
            case 26 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:159: LANGMATCHES
                {
                mLANGMATCHES(); if (state.failed) return ;

                }
                break;
            case 27 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:171: DATATYPE
                {
                mDATATYPE(); if (state.failed) return ;

                }
                break;
            case 28 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:180: BOUND
                {
                mBOUND(); if (state.failed) return ;

                }
                break;
            case 29 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:186: SAMETERM
                {
                mSAMETERM(); if (state.failed) return ;

                }
                break;
            case 30 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:195: ISIRI
                {
                mISIRI(); if (state.failed) return ;

                }
                break;
            case 31 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:201: ISURI
                {
                mISURI(); if (state.failed) return ;

                }
                break;
            case 32 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:207: ISBLANK
                {
                mISBLANK(); if (state.failed) return ;

                }
                break;
            case 33 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:215: ISLITERAL
                {
                mISLITERAL(); if (state.failed) return ;

                }
                break;
            case 34 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:225: REGEX
                {
                mREGEX(); if (state.failed) return ;

                }
                break;
            case 35 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:231: SUBSTR
                {
                mSUBSTR(); if (state.failed) return ;

                }
                break;
            case 36 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:238: TRUE
                {
                mTRUE(); if (state.failed) return ;

                }
                break;
            case 37 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:243: FALSE
                {
                mFALSE(); if (state.failed) return ;

                }
                break;
            case 38 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:249: LOAD
                {
                mLOAD(); if (state.failed) return ;

                }
                break;
            case 39 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:254: CLEAR
                {
                mCLEAR(); if (state.failed) return ;

                }
                break;
            case 40 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:260: DROP
                {
                mDROP(); if (state.failed) return ;

                }
                break;
            case 41 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:265: ADD
                {
                mADD(); if (state.failed) return ;

                }
                break;
            case 42 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:269: MOVE
                {
                mMOVE(); if (state.failed) return ;

                }
                break;
            case 43 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:274: COPY
                {
                mCOPY(); if (state.failed) return ;

                }
                break;
            case 44 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:279: CREATE
                {
                mCREATE(); if (state.failed) return ;

                }
                break;
            case 45 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:286: DELETE
                {
                mDELETE(); if (state.failed) return ;

                }
                break;
            case 46 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:293: INSERT
                {
                mINSERT(); if (state.failed) return ;

                }
                break;
            case 47 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:300: USING
                {
                mUSING(); if (state.failed) return ;

                }
                break;
            case 48 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:306: SILENT
                {
                mSILENT(); if (state.failed) return ;

                }
                break;
            case 49 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:313: DEFAULT
                {
                mDEFAULT(); if (state.failed) return ;

                }
                break;
            case 50 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:321: ALL
                {
                mALL(); if (state.failed) return ;

                }
                break;
            case 51 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:325: DATA
                {
                mDATA(); if (state.failed) return ;

                }
                break;
            case 52 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:330: WITH
                {
                mWITH(); if (state.failed) return ;

                }
                break;
            case 53 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:335: INTO
                {
                mINTO(); if (state.failed) return ;

                }
                break;
            case 54 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:340: TO
                {
                mTO(); if (state.failed) return ;

                }
                break;
            case 55 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:343: AS
                {
                mAS(); if (state.failed) return ;

                }
                break;
            case 56 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:346: GROUP
                {
                mGROUP(); if (state.failed) return ;

                }
                break;
            case 57 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:352: HAVING
                {
                mHAVING(); if (state.failed) return ;

                }
                break;
            case 58 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:359: UNDEF
                {
                mUNDEF(); if (state.failed) return ;

                }
                break;
            case 59 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:365: BINDINGS
                {
                mBINDINGS(); if (state.failed) return ;

                }
                break;
            case 60 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:374: SERVICE
                {
                mSERVICE(); if (state.failed) return ;

                }
                break;
            case 61 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:382: BIND
                {
                mBIND(); if (state.failed) return ;

                }
                break;
            case 62 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:387: MINUS_KEYWORD
                {
                mMINUS_KEYWORD(); if (state.failed) return ;

                }
                break;
            case 63 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:401: IRI
                {
                mIRI(); if (state.failed) return ;

                }
                break;
            case 64 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:405: URI
                {
                mURI(); if (state.failed) return ;

                }
                break;
            case 65 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:409: BNODE
                {
                mBNODE(); if (state.failed) return ;

                }
                break;
            case 66 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:415: RAND
                {
                mRAND(); if (state.failed) return ;

                }
                break;
            case 67 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:420: ABS
                {
                mABS(); if (state.failed) return ;

                }
                break;
            case 68 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:424: CEIL
                {
                mCEIL(); if (state.failed) return ;

                }
                break;
            case 69 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:429: FLOOR
                {
                mFLOOR(); if (state.failed) return ;

                }
                break;
            case 70 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:435: ROUND
                {
                mROUND(); if (state.failed) return ;

                }
                break;
            case 71 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:441: CONCAT
                {
                mCONCAT(); if (state.failed) return ;

                }
                break;
            case 72 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:448: STRLEN
                {
                mSTRLEN(); if (state.failed) return ;

                }
                break;
            case 73 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:455: UCASE
                {
                mUCASE(); if (state.failed) return ;

                }
                break;
            case 74 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:461: LCASE
                {
                mLCASE(); if (state.failed) return ;

                }
                break;
            case 75 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:467: ENCODE_FOR_URI
                {
                mENCODE_FOR_URI(); if (state.failed) return ;

                }
                break;
            case 76 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:482: CONTAINS
                {
                mCONTAINS(); if (state.failed) return ;

                }
                break;
            case 77 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:491: STRSTARTS
                {
                mSTRSTARTS(); if (state.failed) return ;

                }
                break;
            case 78 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:501: STRENDS
                {
                mSTRENDS(); if (state.failed) return ;

                }
                break;
            case 79 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:509: STRBEFORE
                {
                mSTRBEFORE(); if (state.failed) return ;

                }
                break;
            case 80 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:519: STRAFTER
                {
                mSTRAFTER(); if (state.failed) return ;

                }
                break;
            case 81 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:528: REPLACE
                {
                mREPLACE(); if (state.failed) return ;

                }
                break;
            case 82 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:536: YEAR
                {
                mYEAR(); if (state.failed) return ;

                }
                break;
            case 83 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:541: MONTH
                {
                mMONTH(); if (state.failed) return ;

                }
                break;
            case 84 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:547: DAY
                {
                mDAY(); if (state.failed) return ;

                }
                break;
            case 85 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:551: HOURS
                {
                mHOURS(); if (state.failed) return ;

                }
                break;
            case 86 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:557: MINUTES
                {
                mMINUTES(); if (state.failed) return ;

                }
                break;
            case 87 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:565: SECONDS
                {
                mSECONDS(); if (state.failed) return ;

                }
                break;
            case 88 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:573: TIMEZONE
                {
                mTIMEZONE(); if (state.failed) return ;

                }
                break;
            case 89 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:582: TZ
                {
                mTZ(); if (state.failed) return ;

                }
                break;
            case 90 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:585: NOW
                {
                mNOW(); if (state.failed) return ;

                }
                break;
            case 91 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:589: MD5
                {
                mMD5(); if (state.failed) return ;

                }
                break;
            case 92 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:593: SHA1
                {
                mSHA1(); if (state.failed) return ;

                }
                break;
            case 93 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:598: SHA256
                {
                mSHA256(); if (state.failed) return ;

                }
                break;
            case 94 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:605: SHA384
                {
                mSHA384(); if (state.failed) return ;

                }
                break;
            case 95 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:612: SHA512
                {
                mSHA512(); if (state.failed) return ;

                }
                break;
            case 96 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:619: COALESCE
                {
                mCOALESCE(); if (state.failed) return ;

                }
                break;
            case 97 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:628: IF
                {
                mIF(); if (state.failed) return ;

                }
                break;
            case 98 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:631: STRLANG
                {
                mSTRLANG(); if (state.failed) return ;

                }
                break;
            case 99 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:639: STRDT
                {
                mSTRDT(); if (state.failed) return ;

                }
                break;
            case 100 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:645: ISNUMERIC
                {
                mISNUMERIC(); if (state.failed) return ;

                }
                break;
            case 101 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:655: COUNT
                {
                mCOUNT(); if (state.failed) return ;

                }
                break;
            case 102 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:661: SUM
                {
                mSUM(); if (state.failed) return ;

                }
                break;
            case 103 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:665: MIN
                {
                mMIN(); if (state.failed) return ;

                }
                break;
            case 104 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:669: MAX
                {
                mMAX(); if (state.failed) return ;

                }
                break;
            case 105 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:673: AVG
                {
                mAVG(); if (state.failed) return ;

                }
                break;
            case 106 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:677: SAMPLE
                {
                mSAMPLE(); if (state.failed) return ;

                }
                break;
            case 107 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:684: GROUP_CONCAT
                {
                mGROUP_CONCAT(); if (state.failed) return ;

                }
                break;
            case 108 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:697: NOT
                {
                mNOT(); if (state.failed) return ;

                }
                break;
            case 109 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:701: IN
                {
                mIN(); if (state.failed) return ;

                }
                break;
            case 110 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:704: EXISTS
                {
                mEXISTS(); if (state.failed) return ;

                }
                break;
            case 111 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:711: SEPARATOR
                {
                mSEPARATOR(); if (state.failed) return ;

                }
                break;
            case 112 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:721: PNAME_NS
                {
                mPNAME_NS(); if (state.failed) return ;

                }
                break;
            case 113 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:730: PNAME_LN
                {
                mPNAME_LN(); if (state.failed) return ;

                }
                break;
            case 114 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:739: BLANK_NODE_LABEL
                {
                mBLANK_NODE_LABEL(); if (state.failed) return ;

                }
                break;
            case 115 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:756: VAR1
                {
                mVAR1(); if (state.failed) return ;

                }
                break;
            case 116 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:761: VAR2
                {
                mVAR2(); if (state.failed) return ;

                }
                break;
            case 117 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:766: LANGTAG
                {
                mLANGTAG(); if (state.failed) return ;

                }
                break;
            case 118 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:774: INTEGER
                {
                mINTEGER(); if (state.failed) return ;

                }
                break;
            case 119 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:782: DECIMAL
                {
                mDECIMAL(); if (state.failed) return ;

                }
                break;
            case 120 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:790: DOUBLE
                {
                mDOUBLE(); if (state.failed) return ;

                }
                break;
            case 121 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:797: INTEGER_POSITIVE
                {
                mINTEGER_POSITIVE(); if (state.failed) return ;

                }
                break;
            case 122 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:814: DECIMAL_POSITIVE
                {
                mDECIMAL_POSITIVE(); if (state.failed) return ;

                }
                break;
            case 123 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:831: DOUBLE_POSITIVE
                {
                mDOUBLE_POSITIVE(); if (state.failed) return ;

                }
                break;
            case 124 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:847: INTEGER_NEGATIVE
                {
                mINTEGER_NEGATIVE(); if (state.failed) return ;

                }
                break;
            case 125 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:864: DECIMAL_NEGATIVE
                {
                mDECIMAL_NEGATIVE(); if (state.failed) return ;

                }
                break;
            case 126 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:881: DOUBLE_NEGATIVE
                {
                mDOUBLE_NEGATIVE(); if (state.failed) return ;

                }
                break;
            case 127 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:897: STRING_LITERAL1
                {
                mSTRING_LITERAL1(); if (state.failed) return ;

                }
                break;
            case 128 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:913: STRING_LITERAL2
                {
                mSTRING_LITERAL2(); if (state.failed) return ;

                }
                break;
            case 129 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:929: STRING_LITERAL_LONG1
                {
                mSTRING_LITERAL_LONG1(); if (state.failed) return ;

                }
                break;
            case 130 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:950: STRING_LITERAL_LONG2
                {
                mSTRING_LITERAL_LONG2(); if (state.failed) return ;

                }
                break;
            case 131 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:971: IRI_REF
                {
                mIRI_REF(); if (state.failed) return ;

                }
                break;
            case 132 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:979: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;

                }
                break;
            case 133 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:987: REFERENCE
                {
                mREFERENCE(); if (state.failed) return ;

                }
                break;
            case 134 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:997: LESS_EQUAL
                {
                mLESS_EQUAL(); if (state.failed) return ;

                }
                break;
            case 135 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1008: GREATER_EQUAL
                {
                mGREATER_EQUAL(); if (state.failed) return ;

                }
                break;
            case 136 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1022: NOT_EQUAL
                {
                mNOT_EQUAL(); if (state.failed) return ;

                }
                break;
            case 137 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1032: AND
                {
                mAND(); if (state.failed) return ;

                }
                break;
            case 138 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1036: OR
                {
                mOR(); if (state.failed) return ;

                }
                break;
            case 139 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1039: INVERSE
                {
                mINVERSE(); if (state.failed) return ;

                }
                break;
            case 140 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1047: OPEN_BRACE
                {
                mOPEN_BRACE(); if (state.failed) return ;

                }
                break;
            case 141 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1058: CLOSE_BRACE
                {
                mCLOSE_BRACE(); if (state.failed) return ;

                }
                break;
            case 142 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1070: OPEN_CURLY_BRACE
                {
                mOPEN_CURLY_BRACE(); if (state.failed) return ;

                }
                break;
            case 143 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1087: CLOSE_CURLY_BRACE
                {
                mCLOSE_CURLY_BRACE(); if (state.failed) return ;

                }
                break;
            case 144 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1105: OPEN_SQUARE_BRACKET
                {
                mOPEN_SQUARE_BRACKET(); if (state.failed) return ;

                }
                break;
            case 145 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1125: CLOSE_SQUARE_BRACKET
                {
                mCLOSE_SQUARE_BRACKET(); if (state.failed) return ;

                }
                break;
            case 146 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1146: SEMICOLON
                {
                mSEMICOLON(); if (state.failed) return ;

                }
                break;
            case 147 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1156: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 148 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1160: PLUS
                {
                mPLUS(); if (state.failed) return ;

                }
                break;
            case 149 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1165: MINUS
                {
                mMINUS(); if (state.failed) return ;

                }
                break;
            case 150 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1171: ASTERISK
                {
                mASTERISK(); if (state.failed) return ;

                }
                break;
            case 151 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1180: QUESTION_MARK
                {
                mQUESTION_MARK(); if (state.failed) return ;

                }
                break;
            case 152 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1194: COMMA
                {
                mCOMMA(); if (state.failed) return ;

                }
                break;
            case 153 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1200: NEGATION
                {
                mNEGATION(); if (state.failed) return ;

                }
                break;
            case 154 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1209: DIVIDE
                {
                mDIVIDE(); if (state.failed) return ;

                }
                break;
            case 155 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1216: EQUAL
                {
                mEQUAL(); if (state.failed) return ;

                }
                break;
            case 156 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1222: GREATER
                {
                mGREATER(); if (state.failed) return ;

                }
                break;
            case 157 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1230: PIPE
                {
                mPIPE(); if (state.failed) return ;

                }
                break;
            case 158 :
                // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1:1235: ANY
                {
                mANY(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_Sparql
    public final void synpred1_Sparql_fragment() throws RecognitionException {   
        // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1025:6: ( '<' ( options {greedy=false; } : IRI_REF_CHARACTERS )* '>' )
        // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1025:7: '<' ( options {greedy=false; } : IRI_REF_CHARACTERS )* '>'
        {
        match('<'); if (state.failed) return ;
        // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1025:11: ( options {greedy=false; } : IRI_REF_CHARACTERS )*
        loop38:
        do {
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='!'||(LA38_0>='#' && LA38_0<=';')||LA38_0=='='||(LA38_0>='?' && LA38_0<='[')||LA38_0==']'||LA38_0=='_'||(LA38_0>='a' && LA38_0<='z')||(LA38_0>='~' && LA38_0<='\uFFFF')) ) {
                alt38=1;
            }
            else if ( (LA38_0=='>') ) {
                alt38=2;
            }


            switch (alt38) {
        	case 1 :
        	    // /media/OS/Proyectos/epcc/sandbox/SPARQL-DQP11/grammar/Sparql.g:1025:36: IRI_REF_CHARACTERS
        	    {
        	    mIRI_REF_CHARACTERS(); if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop38;
            }
        } while (true);

        match('>'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Sparql

    public final boolean synpred1_Sparql() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Sparql_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String DFA15_eotS =
        "\5\uffff";
    static final String DFA15_eofS =
        "\5\uffff";
    static final String DFA15_minS =
        "\2\56\3\uffff";
    static final String DFA15_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA15_specialS =
        "\5\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "992:1: DOUBLE : ( ( DIGIT )+ DOT ( DIGIT )* EXPONENT | DOT ( DIGIT )+ EXPONENT | ( DIGIT )+ EXPONENT );";
        }
    }
    static final String DFA32_eotS =
        "\1\uffff\1\5\6\uffff\2\5\1\uffff";
    static final String DFA32_eofS =
        "\13\uffff";
    static final String DFA32_minS =
        "\2\45\1\60\1\41\3\uffff\1\60\2\45\1\uffff";
    static final String DFA32_maxS =
        "\2\ufffd\1\172\1\176\3\uffff\1\172\2\ufffd\1\uffff";
    static final String DFA32_acceptS =
        "\4\uffff\1\2\1\4\1\1\3\uffff\1\3";
    static final String DFA32_specialS =
        "\13\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\2\7\uffff\1\1\1\4\1\uffff\12\1\7\uffff\32\1\1\uffff\1\3\2"+
            "\uffff\1\1\1\uffff\32\1\74\uffff\1\1\10\uffff\27\1\1\uffff\37"+
            "\1\1\uffff\u0286\1\1\uffff\u1c81\1\14\uffff\2\1\61\uffff\2\1"+
            "\57\uffff\u0120\1\u0a70\uffff\u03f0\1\21\uffff\ua7ff\1\u2100"+
            "\uffff\u04d0\1\40\uffff\u020e\1",
            "\1\6\7\uffff\2\6\1\uffff\12\6\7\uffff\32\6\1\uffff\1\6\2\uffff"+
            "\1\6\1\uffff\32\6\74\uffff\1\6\10\uffff\27\6\1\uffff\37\6\1"+
            "\uffff\u0286\6\1\uffff\u1c81\6\14\uffff\2\6\61\uffff\2\6\57"+
            "\uffff\u0120\6\u0a70\uffff\u03f0\6\21\uffff\ua7ff\6\u2100\uffff"+
            "\u04d0\6\40\uffff\u020e\6",
            "\12\7\7\uffff\6\7\32\uffff\32\7",
            "\1\10\1\uffff\15\10\12\uffff\2\10\1\uffff\1\10\1\uffff\2\10"+
            "\36\uffff\1\10\36\uffff\1\10",
            "",
            "",
            "",
            "\12\11\7\uffff\6\11\32\uffff\32\11",
            "\1\12\7\uffff\2\12\1\uffff\12\12\7\uffff\32\12\1\uffff\1\12"+
            "\2\uffff\1\12\1\uffff\32\12\74\uffff\1\12\10\uffff\27\12\1\uffff"+
            "\37\12\1\uffff\u0286\12\1\uffff\u1c81\12\14\uffff\2\12\61\uffff"+
            "\2\12\57\uffff\u0120\12\u0a70\uffff\u03f0\12\21\uffff\ua7ff"+
            "\12\u2100\uffff\u04d0\12\40\uffff\u020e\12",
            "\1\12\7\uffff\2\12\1\uffff\12\12\7\uffff\32\12\1\uffff\1\12"+
            "\2\uffff\1\12\1\uffff\32\12\74\uffff\1\12\10\uffff\27\12\1\uffff"+
            "\37\12\1\uffff\u0286\12\1\uffff\u1c81\12\14\uffff\2\12\61\uffff"+
            "\2\12\57\uffff\u0120\12\u0a70\uffff\u03f0\12\21\uffff\ua7ff"+
            "\12\u2100\uffff\u04d0\12\40\uffff\u020e\12",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "()* loopback of 1054:37: ( PN_CHARS | DOT | PLX )*";
        }
    }
    static final String DFA37_eotS =
        "\2\uffff\6\65\1\126\17\65\1\174\1\65\1\177\2\65\1\u0083\1\u0087"+
        "\1\u0089\1\u008c\2\65\1\u0094\1\65\1\u0097\1\u0099\1\u009b\1\65"+
        "\1\u009e\16\uffff\1\u00ab\5\uffff\1\174\22\uffff\1\u00cf\32\uffff"+
        "\1\u00f2\1\uffff\1\u00f4\1\uffff\1\u00f6\1\uffff\1\u00f8\21\uffff"+
        "\1\u0103\1\u0083\2\uffff\1\u0103\1\uffff\1\u0105\2\uffff\1\u0109"+
        "\1\uffff\1\u0090\1\uffff\1\u0092\1\uffff\1\u010f\40\uffff\1\u011f"+
        "\2\uffff\1\u0123\7\uffff\1\u012e\15\uffff\1\u013e\1\u013f\1\uffff"+
        "\1\u0140\1\u0141\1\u0142\1\u0143\5\uffff\1\u0149\1\u014a\16\uffff"+
        "\1\u0159\11\uffff\1\u0162\7\uffff\1\u0168\1\u0169\1\u016a\6\uffff"+
        "\1\u0103\2\uffff\2\u0170\1\uffff\1\u0172\1\uffff\1\u0172\3\uffff"+
        "\1\u0174\1\uffff\1\u0177\22\uffff\1\u0189\4\uffff\1\u018f\2\uffff"+
        "\1\u0193\1\uffff\1\u0194\3\uffff\1\u0198\4\uffff\1\u019d\4\uffff"+
        "\1\u01a2\6\uffff\1\u01a3\7\uffff\1\u01a9\4\uffff\1\u01af\1\u01b0"+
        "\16\uffff\1\u01be\1\uffff\1\u01bf\1\uffff\1\u01c1\11\uffff\1\u01c9"+
        "\1\uffff\1\u0170\1\uffff\1\u0172\1\uffff\1\u01ca\2\uffff\1\u01cc"+
        "\13\uffff\1\u01d8\21\uffff\1\u01e6\2\uffff\1\u01e8\5\uffff\1\u01ed"+
        "\1\u01ee\4\uffff\1\u01f1\1\u01f2\1\u01f3\1\u01f4\1\uffff\1\u01f5"+
        "\2\uffff\1\u01f8\3\uffff\1\u01fa\1\u01fb\1\u01fd\1\u01fe\1\u01ff"+
        "\1\u0200\1\u0201\1\u0202\1\u0203\10\uffff\1\u0209\1\u020a\2\uffff"+
        "\1\u020d\6\uffff\1\u0211\1\u0212\3\uffff\1\u0216\7\uffff\1\u021d"+
        "\1\u021e\1\u021f\1\u0220\1\u0221\1\u0222\2\uffff\1\u0225\7\uffff"+
        "\1\u022b\4\uffff\1\u022e\1\u022f\5\uffff\1\u0230\20\uffff\1\u0237"+
        "\4\uffff\1\u023a\2\uffff\1\u023c\3\uffff\1\u023e\1\u023f\2\uffff"+
        "\1\u0241\1\uffff\1\u0243\14\uffff\1\u0249\1\uffff\1\u024b\1\u024c"+
        "\12\uffff\1\u0253\4\uffff\1\u0257\3\uffff\1\u0259\7\uffff\1\u025d"+
        "\1\u025e\1\u025f\1\u0260\1\uffff\1\u0261\3\uffff\1\u0263\1\u0264"+
        "\1\u0265\5\uffff\1\u026a\3\uffff\1\u026c\1\u026d\1\u026e\5\uffff"+
        "\1\u026f\5\uffff\1\u0272\1\u0273\13\uffff\1\u0278\3\uffff\1\u027b"+
        "\3\uffff\1\u027e\1\uffff";
    static final String DFA37_eofS =
        "\u027f\uffff";
    static final String DFA37_minS =
        "\1\0\1\uffff\26\55\1\45\1\72\2\60\1\101\1\56\1\60\2\56\2\0\1\75"+
        "\1\0\1\136\2\75\1\46\1\174\15\uffff\7\55\1\45\27\55\1\uffff\45\55"+
        "\10\uffff\1\60\1\56\2\uffff\1\60\1\uffff\1\56\1\60\1\uffff\1\56"+
        "\1\60\1\47\1\uffff\1\42\1\uffff\1\41\26\uffff\1\55\1\uffff\43\55"+
        "\1\uffff\42\55\1\uffff\1\55\1\uffff\1\55\1\uffff\1\55\1\uffff\12"+
        "\55\1\uffff\1\60\2\uffff\2\60\1\uffff\1\60\1\uffff\1\60\3\uffff"+
        "\17\55\1\uffff\3\55\1\uffff\12\55\1\uffff\17\55\6\uffff\5\55\2\uffff"+
        "\16\55\1\uffff\10\55\1\uffff\5\55\3\uffff\5\55\1\uffff\1\60\1\uffff"+
        "\1\60\1\uffff\2\55\1\uffff\21\55\1\uffff\5\55\1\uffff\3\55\2\uffff"+
        "\3\55\1\uffff\4\55\1\uffff\4\55\2\uffff\5\55\1\uffff\5\55\2\uffff"+
        "\15\55\2\uffff\1\55\1\uffff\7\55\2\uffff\1\55\1\uffff\13\55\1\uffff"+
        "\15\55\1\uffff\1\55\1\uffff\4\55\2\uffff\2\55\5\uffff\2\55\1\uffff"+
        "\1\55\2\uffff\1\55\7\uffff\5\55\2\uffff\2\55\1\uffff\3\55\2\uffff"+
        "\3\55\1\uffff\6\55\6\uffff\2\55\1\uffff\5\55\1\uffff\2\55\3\uffff"+
        "\6\55\1\uffff\2\55\1\uffff\1\55\1\uffff\1\55\2\uffff\1\55\1\uffff"+
        "\1\55\1\uffff\5\55\1\uffff\1\55\2\uffff\6\55\1\uffff\3\55\1\uffff"+
        "\1\55\1\uffff\3\55\5\uffff\1\55\3\uffff\4\55\1\uffff\1\55\4\uffff"+
        "\2\55\2\uffff\4\55\1\uffff\2\55\1\uffff\2\55\1\uffff";
    static final String DFA37_maxS =
        "\1\uffff\1\uffff\27\ufffd\1\72\2\ufffd\1\172\1\145\3\71\2\uffff"+
        "\1\75\1\uffff\1\136\2\75\1\46\1\174\15\uffff\37\ufffd\1\uffff\45"+
        "\ufffd\10\uffff\2\145\2\uffff\1\145\1\uffff\1\145\1\71\1\uffff\1"+
        "\145\1\71\1\47\1\uffff\1\42\1\uffff\1\uffff\26\uffff\1\ufffd\1\uffff"+
        "\43\ufffd\1\uffff\42\ufffd\1\uffff\1\ufffd\1\uffff\1\ufffd\1\uffff"+
        "\1\ufffd\1\uffff\12\ufffd\1\uffff\1\145\2\uffff\2\145\1\uffff\1"+
        "\145\1\uffff\1\145\3\uffff\17\ufffd\1\uffff\3\ufffd\1\uffff\12\ufffd"+
        "\1\uffff\17\ufffd\6\uffff\5\ufffd\2\uffff\16\ufffd\1\uffff\10\ufffd"+
        "\1\uffff\5\ufffd\3\uffff\5\ufffd\1\uffff\1\145\1\uffff\1\145\1\uffff"+
        "\2\ufffd\1\uffff\21\ufffd\1\uffff\5\ufffd\1\uffff\3\ufffd\2\uffff"+
        "\3\ufffd\1\uffff\4\ufffd\1\uffff\4\ufffd\2\uffff\5\ufffd\1\uffff"+
        "\5\ufffd\2\uffff\15\ufffd\2\uffff\1\ufffd\1\uffff\7\ufffd\2\uffff"+
        "\1\ufffd\1\uffff\13\ufffd\1\uffff\15\ufffd\1\uffff\1\ufffd\1\uffff"+
        "\4\ufffd\2\uffff\2\ufffd\5\uffff\2\ufffd\1\uffff\1\ufffd\2\uffff"+
        "\1\ufffd\7\uffff\5\ufffd\2\uffff\2\ufffd\1\uffff\3\ufffd\2\uffff"+
        "\3\ufffd\1\uffff\6\ufffd\6\uffff\2\ufffd\1\uffff\5\ufffd\1\uffff"+
        "\2\ufffd\3\uffff\6\ufffd\1\uffff\2\ufffd\1\uffff\1\ufffd\1\uffff"+
        "\1\ufffd\2\uffff\1\ufffd\1\uffff\1\ufffd\1\uffff\5\ufffd\1\uffff"+
        "\1\ufffd\2\uffff\6\ufffd\1\uffff\3\ufffd\1\uffff\1\ufffd\1\uffff"+
        "\3\ufffd\5\uffff\1\ufffd\3\uffff\4\ufffd\1\uffff\1\ufffd\4\uffff"+
        "\2\ufffd\2\uffff\4\ufffd\1\uffff\2\ufffd\1\uffff\2\ufffd\1\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\50\uffff\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1"+
        "\u0091\1\u0092\1\u0096\1\u0098\1\u009a\1\u009b\1\u009e\1\1\37\uffff"+
        "\1\27\45\uffff\1\160\1\161\1\162\1\u0097\1\163\1\164\1\165\1\166"+
        "\2\uffff\1\170\1\u0093\1\uffff\1\u0094\2\uffff\1\u0095\3\uffff\1"+
        "\177\1\uffff\1\u0080\1\uffff\1\u0083\1\u0084\1\u0085\1\u008b\1\u0087"+
        "\1\u009c\1\u0088\1\u0099\1\u0089\1\u008a\1\u009d\1\u008c\1\u008d"+
        "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0096\1\u0098\1\u009a"+
        "\1\u009b\1\uffff\1\16\43\uffff\1\67\42\uffff\1\155\1\uffff\1\141"+
        "\1\uffff\1\66\1\uffff\1\131\12\uffff\1\167\1\uffff\1\171\1\173\2"+
        "\uffff\1\174\1\uffff\1\176\1\uffff\1\u0081\1\u0082\1\u0086\17\uffff"+
        "\1\30\3\uffff\1\146\12\uffff\1\124\17\uffff\1\11\1\17\1\51\1\62"+
        "\1\103\1\151\5\uffff\1\132\1\154\16\uffff\1\100\10\uffff\1\77\5"+
        "\uffff\1\147\1\133\1\150\5\uffff\1\172\1\uffff\1\175\1\uffff\1\2"+
        "\2\uffff\1\75\21\uffff\1\134\5\uffff\1\20\3\uffff\1\63\1\50\3\uffff"+
        "\1\102\4\uffff\1\53\4\uffff\1\104\1\12\5\uffff\1\64\5\uffff\1\31"+
        "\1\46\15\uffff\1\65\1\44\1\uffff\1\52\7\uffff\1\122\1\34\1\uffff"+
        "\1\101\13\uffff\1\143\15\uffff\1\42\1\uffff\1\106\4\uffff\1\145"+
        "\1\47\2\uffff\1\45\1\105\1\13\1\14\1\15\2\uffff\1\21\1\uffff\1\112"+
        "\1\24\1\uffff\1\70\1\25\1\72\1\57\1\111\1\36\1\37\5\uffff\1\123"+
        "\1\76\2\uffff\1\125\3\uffff\1\3\1\4\3\uffff\1\110\6\uffff\1\152"+
        "\1\43\1\60\1\135\1\136\1\137\2\uffff\1\55\5\uffff\1\107\2\uffff"+
        "\1\54\1\26\1\22\6\uffff\1\56\2\uffff\1\71\1\uffff\1\156\1\uffff"+
        "\1\74\1\127\1\uffff\1\142\1\uffff\1\116\5\uffff\1\61\1\uffff\1\6"+
        "\1\121\6\uffff\1\40\3\uffff\1\126\1\uffff\1\73\3\uffff\1\120\1\35"+
        "\1\5\1\10\1\33\1\uffff\1\114\1\140\1\23\4\uffff\1\130\1\uffff\1"+
        "\157\1\115\1\117\1\7\2\uffff\1\41\1\144\4\uffff\1\32\2\uffff\1\153"+
        "\2\uffff\1\113";
    static final String DFA37_specialS =
        "\1\3\40\uffff\1\2\1\1\1\uffff\1\0\u025a\uffff}>";
    static final String[] DFA37_transitionS = {
            "\11\65\2\1\2\65\1\1\22\65\1\1\1\47\1\42\1\44\1\33\1\65\1\50"+
            "\1\41\1\52\1\53\1\61\1\37\1\62\1\40\1\36\1\63\12\35\1\30\1\60"+
            "\1\43\1\64\1\46\1\32\1\34\1\20\1\2\1\7\1\5\1\25\1\11\1\16\1"+
            "\24\1\21\2\27\1\15\1\23\1\12\1\14\1\3\1\27\1\6\1\4\1\22\1\17"+
            "\1\27\1\13\1\27\1\26\1\27\1\56\1\65\1\57\1\45\1\31\1\65\1\10"+
            "\1\2\1\7\1\5\1\25\1\11\1\16\1\24\1\21\2\27\1\15\1\23\1\12\1"+
            "\14\1\3\1\27\1\6\1\4\1\22\1\17\1\27\1\13\1\27\1\26\1\27\1\54"+
            "\1\51\1\55\102\65\27\27\1\65\37\27\1\65\u0208\27\160\65\16\27"+
            "\1\65\u1c81\27\14\65\2\27\142\65\u0120\27\u0a70\65\u03f0\27"+
            "\21\65\ua7ff\27\u2100\65\u04d0\27\40\65\u020e\27\2\65",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\67\7\74\1\72\4\74\1"+
            "\73\1\71\11\74\1\70\1\74\4\uffff\1\74\1\uffff\1\67\7\74\1\72"+
            "\4\74\1\73\1\71\11\74\1\70\1\74\74\uffff\1\74\10\uffff\27\74"+
            "\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2"+
            "\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\77\10\74\4\uffff"+
            "\1\74\1\uffff\21\74\1\77\10\74\74\uffff\1\74\10\uffff\27\74"+
            "\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2"+
            "\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\102\3\74\1\100\2\74"+
            "\1\105\1\104\12\74\1\101\1\103\5\74\4\uffff\1\74\1\uffff\1\102"+
            "\3\74\1\100\2\74\1\105\1\104\12\74\1\101\1\103\5\74\74\uffff"+
            "\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff"+
            "\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70"+
            "\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff"+
            "\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\110\3\74\1\107\3\74"+
            "\1\106\10\74\1\111\10\74\4\uffff\1\74\1\uffff\1\110\3\74\1\107"+
            "\3\74\1\106\10\74\1\111\10\74\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\113\3\74\1\112\11\74"+
            "\1\114\13\74\4\uffff\1\74\1\uffff\1\113\3\74\1\112\11\74\1\114"+
            "\13\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286"+
            "\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\120\6\74\1\116"+
            "\2\74\1\115\2\74\1\117\10\74\4\uffff\1\74\1\uffff\4\74\1\120"+
            "\6\74\1\116\2\74\1\115\2\74\1\117\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\74\1\124\1\74\1\122"+
            "\7\74\1\123\6\74\1\121\2\74\1\125\4\74\4\uffff\1\74\1\uffff"+
            "\1\74\1\124\1\74\1\122\7\74\1\123\6\74\1\121\2\74\1\125\4\74"+
            "\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74"+
            "\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\131\7\74\1\130\2\74"+
            "\1\132\5\74\1\127\10\74\4\uffff\1\74\1\uffff\1\131\7\74\1\130"+
            "\2\74\1\132\5\74\1\127\10\74\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\133\15\74\1\134\13"+
            "\74\4\uffff\1\74\1\uffff\1\133\15\74\1\134\13\74\74\uffff\1"+
            "\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81"+
            "\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff"+
            "\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e"+
            "\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\7\74\1\135\1\136\21\74"+
            "\4\uffff\1\74\1\uffff\7\74\1\135\1\136\21\74\74\uffff\1\74\10"+
            "\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74"+
            "\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0"+
            "\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\140\11\74\1\141"+
            "\1\74\1\137\10\74\4\uffff\1\74\1\uffff\5\74\1\140\11\74\1\141"+
            "\1\74\1\137\10\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74"+
            "\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2"+
            "\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74"+
            "\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\143\1\74\1\145\5\74"+
            "\1\142\5\74\1\144\13\74\4\uffff\1\74\1\uffff\1\143\1\74\1\145"+
            "\5\74\1\142\5\74\1\144\13\74\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\146\10\74\4\uffff"+
            "\1\74\1\uffff\21\74\1\146\10\74\74\uffff\1\74\10\uffff\27\74"+
            "\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2"+
            "\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\152\12\74\1\147"+
            "\3\74\1\151\1\150\7\74\4\uffff\1\74\1\uffff\2\74\1\152\12\74"+
            "\1\147\3\74\1\151\1\150\7\74\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\74\1\124\1\74\1\122"+
            "\7\74\1\123\6\74\1\121\2\74\1\125\4\74\4\uffff\1\74\1\uffff"+
            "\1\74\1\124\1\74\1\122\7\74\1\123\6\74\1\121\2\74\1\125\4\74"+
            "\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74"+
            "\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\156\7\74\1\154"+
            "\3\74\1\155\1\153\7\74\4\uffff\1\74\1\uffff\5\74\1\156\7\74"+
            "\1\154\3\74\1\155\1\153\7\74\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\161\5\74\1\160"+
            "\2\74\1\157\7\74\1\162\4\uffff\1\74\1\uffff\10\74\1\161\5\74"+
            "\1\160\2\74\1\157\7\74\1\162\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\166\2\74\1\165\4\74"+
            "\1\164\5\74\1\163\13\74\4\uffff\1\74\1\uffff\1\166\2\74\1\165"+
            "\4\74\1\164\5\74\1\163\13\74\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\167\15\74\1\170\13"+
            "\74\4\uffff\1\74\1\uffff\1\167\15\74\1\170\13\74\74\uffff\1"+
            "\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81"+
            "\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff"+
            "\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e"+
            "\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\171\11\74\1\172"+
            "\2\74\4\uffff\1\74\1\uffff\15\74\1\171\11\74\1\172\2\74\74\uffff"+
            "\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff"+
            "\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70"+
            "\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff"+
            "\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\173\25\74\4\uffff"+
            "\1\74\1\uffff\4\74\1\173\25\74\74\uffff\1\74\10\uffff\27\74"+
            "\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2"+
            "\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\175\12\uffff\12\175\7\uffff\32\175\1\uffff\1\175\2\uffff"+
            "\1\175\1\uffff\32\175\105\uffff\27\175\1\uffff\37\175\1\uffff"+
            "\u0208\175\160\uffff\16\175\1\uffff\u1c81\175\14\uffff\2\175"+
            "\142\uffff\u0120\175\u0a70\uffff\u03f0\175\21\uffff\ua7ff\175"+
            "\u2100\uffff\u04d0\175\40\uffff\u020e\175",
            "\1\176",
            "\12\u0080\7\uffff\32\u0080\4\uffff\1\u0080\1\uffff\32\u0080"+
            "\105\uffff\27\u0080\1\uffff\37\u0080\1\uffff\u0208\u0080\160"+
            "\uffff\16\u0080\1\uffff\u1c81\u0080\14\uffff\2\u0080\142\uffff"+
            "\u0120\u0080\u0a70\uffff\u03f0\u0080\21\uffff\ua7ff\u0080\u2100"+
            "\uffff\u04d0\u0080\40\uffff\u020e\u0080",
            "\12\u0081\7\uffff\32\u0081\4\uffff\1\u0081\1\uffff\32\u0081"+
            "\105\uffff\27\u0081\1\uffff\37\u0081\1\uffff\u0208\u0081\160"+
            "\uffff\16\u0081\1\uffff\u1c81\u0081\14\uffff\2\u0081\142\uffff"+
            "\u0120\u0081\u0a70\uffff\u03f0\u0081\21\uffff\ua7ff\u0081\u2100"+
            "\uffff\u04d0\u0081\40\uffff\u020e\u0081",
            "\32\u0082\6\uffff\32\u0082",
            "\1\u0084\1\uffff\12\u0085\13\uffff\1\u0086\37\uffff\1\u0086",
            "\12\u0088",
            "\1\u008b\1\uffff\12\u008a",
            "\1\u008e\1\uffff\12\u008d",
            "\12\u0090\1\uffff\2\u0090\1\uffff\31\u0090\1\u008f\uffd8\u0090",
            "\12\u0092\1\uffff\2\u0092\1\uffff\24\u0092\1\u0091\uffdd\u0092",
            "\1\u0093",
            "\0\u0095",
            "\1\u0096",
            "\1\u0098",
            "\1\u009a",
            "\1\u009c",
            "\1\u009d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u00aa\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u00aa\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u00ac\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u00ac\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u00ad\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u00ad\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u00ae\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u00ae\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff"+
            "\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286"+
            "\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\175\12\uffff\12\175\7\uffff\32\175\1\uffff\1\175\2\uffff"+
            "\1\175\1\uffff\32\175\105\uffff\27\175\1\uffff\37\175\1\uffff"+
            "\u0208\175\160\uffff\16\175\1\uffff\u1c81\175\14\uffff\2\175"+
            "\142\uffff\u0120\175\u0a70\uffff\u03f0\175\21\uffff\ua7ff\175"+
            "\u2100\uffff\u04d0\175\40\uffff\u020e\175",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u00af\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u00af\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u00b2\10\74\1"+
            "\u00b0\3\74\1\u00b3\1\74\1\u00b1\10\74\4\uffff\1\74\1\uffff"+
            "\2\74\1\u00b2\10\74\1\u00b0\3\74\1\u00b3\1\74\1\u00b1\10\74"+
            "\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74"+
            "\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u00b4\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u00b4\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u00b5\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u00b5\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\74\1\u00b6\12\74\1"+
            "\u00b7\15\74\4\uffff\1\74\1\uffff\1\74\1\u00b6\12\74\1\u00b7"+
            "\15\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286"+
            "\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u00b8\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u00b8\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u00b9\31\74\4\uffff"+
            "\1\74\1\uffff\1\u00b9\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u00ba\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u00ba\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\u00bd\5\74\1\u00bc"+
            "\6\74\1\u00bb\7\74\4\uffff\1\74\1\uffff\5\74\1\u00bd\5\74\1"+
            "\u00bc\6\74\1\u00bb\7\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u00be\4\74\1"+
            "\u00bf\1\74\4\uffff\1\74\1\uffff\23\74\1\u00be\4\74\1\u00bf"+
            "\1\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286"+
            "\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u00c0\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u00c0\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u00c1\2\74\1\u00c2"+
            "\10\74\1\u00c3\12\74\4\uffff\1\74\1\uffff\3\74\1\u00c1\2\74"+
            "\1\u00c2\10\74\1\u00c3\12\74\74\uffff\1\74\10\uffff\27\74\1"+
            "\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74"+
            "\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff"+
            "\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u00c4\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u00c4\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u00c5\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u00c5\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u00c8\14\74\1\u00c6"+
            "\1\74\1\u00c7\4\74\1\u00c9\5\74\4\uffff\1\74\1\uffff\1\u00c8"+
            "\14\74\1\u00c6\1\74\1\u00c7\4\74\1\u00c9\5\74\74\uffff\1\74"+
            "\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81"+
            "\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff"+
            "\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e"+
            "\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u00ca\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u00ca\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u00cb\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u00cb\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u00cc\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u00cc\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u00ce\7\74\1\u00cd"+
            "\17\74\4\uffff\1\74\1\uffff\2\74\1\u00ce\7\74\1\u00cd\17\74"+
            "\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74"+
            "\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u00d0\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u00d0\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u00d1\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u00d1\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u00d2\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u00d2\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\6\74\1\u00d3\23\74\4"+
            "\uffff\1\74\1\uffff\6\74\1\u00d3\23\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u00d4\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u00d4\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u00d5\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u00d5\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u00d6\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u00d6\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u00d7\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u00d7\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u00d8\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u00d8\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u00da\2\74\1"+
            "\u00d9\3\74\4\uffff\1\74\1\uffff\23\74\1\u00da\2\74\1\u00d9"+
            "\3\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286"+
            "\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u00db\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u00db\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u00dc\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u00dc\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u00dd\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u00dd\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\u00de\24\74\4"+
            "\uffff\1\74\1\uffff\5\74\1\u00de\24\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u00df\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u00df\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u00e0\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u00e0\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u00e1\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u00e1\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u00e2\31\74\4\uffff"+
            "\1\74\1\uffff\1\u00e2\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u00e3\31\74\4\uffff"+
            "\1\74\1\uffff\1\u00e3\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u00e4\15\74\1\u00e5"+
            "\13\74\4\uffff\1\74\1\uffff\1\u00e4\15\74\1\u00e5\13\74\74\uffff"+
            "\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff"+
            "\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70"+
            "\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff"+
            "\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u00e7\4\74\1\u00e6"+
            "\21\74\4\uffff\1\74\1\uffff\3\74\1\u00e7\4\74\1\u00e6\21\74"+
            "\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74"+
            "\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u00e8\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u00e8\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u00e9\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u00e9\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u00ea\31\74\4\uffff"+
            "\1\74\1\uffff\1\u00ea\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\74\1\u00ed\6\74\1\u00eb"+
            "\2\74\1\u00ee\1\74\1\u00ef\6\74\1\u00ec\5\74\4\uffff\1\74\1"+
            "\uffff\1\74\1\u00ed\6\74\1\u00eb\2\74\1\u00ee\1\74\1\u00ef\6"+
            "\74\1\u00ec\5\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74"+
            "\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2"+
            "\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74"+
            "\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u00f0\1\u00f1"+
            "\6\74\4\uffff\1\74\1\uffff\22\74\1\u00f0\1\u00f1\6\74\74\uffff"+
            "\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff"+
            "\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70"+
            "\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff"+
            "\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u00f3\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u00f3\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u00f5\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u00f5\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u00f7\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u00f7\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u00fa\7\74\1"+
            "\u00f9\4\74\4\uffff\1\74\1\uffff\15\74\1\u00fa\7\74\1\u00f9"+
            "\4\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286"+
            "\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u00fb\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u00fb\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\5\74\1\u00fc\4\74\1\76\6\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37"+
            "\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\27\74\1\u00fd\2\74\4"+
            "\uffff\1\74\1\uffff\27\74\1\u00fd\2\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\25\74\1\u00fe\4\74\4"+
            "\uffff\1\74\1\uffff\25\74\1\u00fe\4\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u00ff\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u00ff\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0100\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u0100\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u0101\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u0101\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u0102\31\74\4\uffff"+
            "\1\74\1\uffff\1\u0102\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0104\13\uffff\1\u0086\37\uffff\1\u0086",
            "\1\u0084\1\uffff\12\u0085\13\uffff\1\u0086\37\uffff\1\u0086",
            "",
            "",
            "\12\u0088\13\uffff\1\u0086\37\uffff\1\u0086",
            "",
            "\1\u0107\1\uffff\12\u008a\13\uffff\1\u0106\37\uffff\1\u0106",
            "\12\u0108",
            "",
            "\1\u010a\1\uffff\12\u008d\13\uffff\1\u010b\37\uffff\1\u010b",
            "\12\u010c",
            "\1\u010d",
            "",
            "\1\u010e",
            "",
            "\1\u0094\1\uffff\31\u0094\1\uffff\37\u0094\1\uffff\1\u0094"+
            "\1\uffff\1\u0094\1\uffff\32\u0094\3\uffff\uff82\u0094",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0110\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0110\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u0111\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u0111\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u0112\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u0112\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u0113\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u0113\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\u0114\24\74\4"+
            "\uffff\1\74\1\uffff\5\74\1\u0114\24\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0115\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0115\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\25\74\1\u0116\4\74\4"+
            "\uffff\1\74\1\uffff\25\74\1\u0116\4\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u0117\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u0117\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u0118\31\74\4\uffff"+
            "\1\74\1\uffff\1\u0118\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u011d\1\u011c\1\74"+
            "\1\u011e\1\u011b\6\74\1\u0119\6\74\1\u011a\7\74\4\uffff\1\74"+
            "\1\uffff\1\u011d\1\u011c\1\74\1\u011e\1\u011b\6\74\1\u0119\6"+
            "\74\1\u011a\7\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74"+
            "\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2"+
            "\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74"+
            "\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0120\12\74\1"+
            "\u0121\12\74\4\uffff\1\74\1\uffff\4\74\1\u0120\12\74\1\u0121"+
            "\12\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286"+
            "\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120"+
            "\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0"+
            "\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u0122\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u0122\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0124\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0124\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\1\74\1\u0125\1\u0126\1\u0127\1\74\1\u0128"+
            "\4\74\1\76\6\uffff\32\74\4\uffff\1\74\1\uffff\32\74\74\uffff"+
            "\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff"+
            "\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70"+
            "\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff"+
            "\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0129\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0129\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u012a\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u012a\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u012b\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u012b\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u012c\31\74\4\uffff"+
            "\1\74\1\uffff\1\u012c\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u012d\31\74\4\uffff"+
            "\1\74\1\uffff\1\u012d\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\17\74\1\u012f\12\74\4"+
            "\uffff\1\74\1\uffff\17\74\1\u012f\12\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u0130\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u0130\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0131\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0131\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u0132\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u0132\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u0133\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u0133\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u0134\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u0134\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0136\17\74\1"+
            "\u0135\1\u0137\6\74\4\uffff\1\74\1\uffff\2\74\1\u0136\17\74"+
            "\1\u0135\1\u0137\6\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37"+
            "\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\30\74\1\u0138\1\74\4"+
            "\uffff\1\74\1\uffff\30\74\1\u0138\1\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u0139\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u0139\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u013a\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u013a\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u013b\31\74\4\uffff"+
            "\1\74\1\uffff\1\u013b\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u013c\31\74\4\uffff"+
            "\1\74\1\uffff\1\u013c\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u013d\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u013d\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u0144\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u0144\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0145\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0145\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u0146\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u0146\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u0147\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u0147\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0148\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0148\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u014b\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u014b\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\7\74\1\u014c\22\74\4"+
            "\uffff\1\74\1\uffff\7\74\1\u014c\22\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u014d\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u014d\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u014e\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u014e\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u014f\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u014f\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u0150\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u0150\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\6\74\1\u0151\23\74\4"+
            "\uffff\1\74\1\uffff\6\74\1\u0151\23\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u0152\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u0152\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u0153\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u0153\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\17\74\1\u0154\12\74\4"+
            "\uffff\1\74\1\uffff\17\74\1\u0154\12\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u0155\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u0155\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u0156\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u0156\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0157\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0157\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u0158\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u0158\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u015a\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u015a\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u015b\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u015b\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u015c\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u015c\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u015d\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u015d\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u015e\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u015e\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u015f\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u015f\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0160\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0160\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u0161\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u0161\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0163\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0163\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0164\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0164\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0165\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0165\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0166\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0166\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u0167\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u0167\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u016b\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u016b\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u016c\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u016c\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u016d\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u016d\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u016e\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u016e\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u016f\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u016f\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\12\u0104\13\uffff\1\u0086\37\uffff\1\u0086",
            "",
            "",
            "\12\u0171\13\uffff\1\u0106\37\uffff\1\u0106",
            "\12\u0108\13\uffff\1\u0106\37\uffff\1\u0106",
            "",
            "\12\u0173\13\uffff\1\u010b\37\uffff\1\u010b",
            "",
            "\12\u010c\13\uffff\1\u010b\37\uffff\1\u010b",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u0175\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u0175\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u0176\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u0176\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0178\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0178\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u0179\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u0179\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u017a\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u017a\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u017b\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u017b\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u017c\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u017c\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u017d\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u017d\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u017f\3\74\1\u017e"+
            "\25\74\4\uffff\1\74\1\uffff\1\u017f\3\74\1\u017e\25\74\74\uffff"+
            "\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff"+
            "\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70"+
            "\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff"+
            "\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0180\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0180\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u0181\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u0181\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0182\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0182\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\u0183\24\74\4"+
            "\uffff\1\74\1\uffff\5\74\1\u0183\24\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0184\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0184\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0185\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0185\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u0186\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u0186\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0187\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0187\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u0188\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u0188\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\5\74\1\u018a\4\74\1\76\6\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37"+
            "\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\10\74\1\u018b\1\74\1\76\6\uffff\32\74\4"+
            "\uffff\1\74\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\1\74\1\u018c\10\74\1\76\6\uffff\32\74\4"+
            "\uffff\1\74\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u018d\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u018d\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u018e\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u018e\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0190\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0190\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u0191\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u0191\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0192\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0192\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0195\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u0195\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\27\74\1\u0196\2\74\4"+
            "\uffff\1\74\1\uffff\27\74\1\u0196\2\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u0197\31\74\4\uffff"+
            "\1\74\1\uffff\1\u0197\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u0199\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u0199\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u019a\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u019a\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u019b\31\74\4\uffff"+
            "\1\74\1\uffff\1\u019b\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u019c\31\74\4\uffff"+
            "\1\74\1\uffff\1\u019c\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u019e\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u019e\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u019f\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u019f\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u01a0\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u01a0\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01a1\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01a1\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01a4\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01a4\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01a5\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01a5\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u01a6\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u01a6\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u01a7\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u01a7\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01a8\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01a8\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u01aa\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u01aa\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01ab\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01ab\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u01ac\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u01ac\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01ad\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01ad\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u01ae\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u01ae\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01b1\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01b1\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\7\74\1\u01b2\22\74\4"+
            "\uffff\1\74\1\uffff\7\74\1\u01b2\22\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\17\74\1\u01b3\12\74\4"+
            "\uffff\1\74\1\uffff\17\74\1\u01b3\12\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u01b4\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u01b4\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\u01b5\24\74\4"+
            "\uffff\1\74\1\uffff\5\74\1\u01b5\24\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\6\74\1\u01b6\23\74\4"+
            "\uffff\1\74\1\uffff\6\74\1\u01b6\23\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01b7\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01b7\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u01b8\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u01b8\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u01b9\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u01b9\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u01ba\31\74\4\uffff"+
            "\1\74\1\uffff\1\u01ba\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01bb\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01bb\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u01bc\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u01bc\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u01bd\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u01bd\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\31\74\1\u01c0\4\uffff"+
            "\1\74\1\uffff\31\74\1\u01c0\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\7\74\1\u01c2\22\74\4"+
            "\uffff\1\74\1\uffff\7\74\1\u01c2\22\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u01c3\1\u01c4"+
            "\6\74\4\uffff\1\74\1\uffff\22\74\1\u01c3\1\u01c4\6\74\74\uffff"+
            "\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff"+
            "\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70"+
            "\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff"+
            "\u020e\74",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u01c5\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u01c5\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u01c6\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u01c6\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u01c7\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u01c7\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01c8\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01c8\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\12\u0171\13\uffff\1\u0106\37\uffff\1\u0106",
            "",
            "\12\u0173\13\uffff\1\u010b\37\uffff\1\u010b",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u01cb\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u01cb\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\27\74\1\u01cd\2\74\4"+
            "\uffff\1\74\1\uffff\27\74\1\u01cd\2\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01ce\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01ce\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u01cf\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u01cf\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u01d0\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u01d0\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u01d1\31\74\4\uffff"+
            "\1\74\1\uffff\1\u01d1\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u01d2\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u01d2\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u01d3\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u01d3\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u01d4\31\74\4\uffff"+
            "\1\74\1\uffff\1\u01d4\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u01d5\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u01d5\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\u01d6\24\74\4"+
            "\uffff\1\74\1\uffff\5\74\1\u01d6\24\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01d7\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01d7\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01d9\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01d9\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01da\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01da\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u01db\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u01db\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01dc\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01dc\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\6\74\1\u01dd\3\74\1\76\6\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37"+
            "\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\4\74\1\u01de\5\74\1\76\6\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37"+
            "\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\2\74\1\u01df\7\74\1\76\6\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37"+
            "\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u01e0\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u01e0\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u01e1\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u01e1\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01e2\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01e2\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u01e3\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u01e3\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\30\74\1\u01e4\1\74\4"+
            "\uffff\1\74\1\uffff\30\74\1\u01e4\1\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01e5\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01e5\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u01e7\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u01e7\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u01e9\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u01e9\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01ea\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01ea\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u01eb\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u01eb\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u01ec\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u01ec\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u01ef\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u01ef\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u01f0\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u01f0\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u01f6\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u01f6\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u01f7\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u01f7\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u01f9\31\74\4\uffff"+
            "\1\74\1\uffff\1\u01f9\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\u01fc"+
            "\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1"+
            "\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74"+
            "\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100"+
            "\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u0204\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u0204\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0205\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0205\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0206\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0206\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0207\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0207\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u0208\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u0208\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u020b\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u020b\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\6\74\1\u020c\23\74\4"+
            "\uffff\1\74\1\uffff\6\74\1\u020c\23\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u020e\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u020e\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u020f\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u020f\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\6\74\1\u0210\23\74\4"+
            "\uffff\1\74\1\uffff\6\74\1\u0210\23\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0213\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0213\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u0214\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u0214\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0215\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0215\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\6\74\1\u0217\23\74\4"+
            "\uffff\1\74\1\uffff\6\74\1\u0217\23\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u0218\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u0218\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u0219\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u0219\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u021a\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u021a\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u021b\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u021b\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u021c\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u021c\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0223\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u0223\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\74\1\u0224\30\74\4"+
            "\uffff\1\74\1\uffff\1\74\1\u0224\30\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0226\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0226\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\17\74\1\u0227\12\74\4"+
            "\uffff\1\74\1\uffff\17\74\1\u0227\12\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\3\74\1\u0228\26\74\4"+
            "\uffff\1\74\1\uffff\3\74\1\u0228\26\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0229\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0229\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u022a\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u022a\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u022c\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u022c\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u022d\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u022d\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u0231\31\74\4\uffff"+
            "\1\74\1\uffff\1\u0231\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0232\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0232\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0233\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u0233\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\12\74\1\u0234\17\74\4"+
            "\uffff\1\74\1\uffff\12\74\1\u0234\17\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u0235\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u0235\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u0236\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u0236\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u0238\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u0238\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u0239\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u0239\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\u023b"+
            "\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1"+
            "\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74"+
            "\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100"+
            "\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u023d\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u023d\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u0240\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u0240\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0242\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0242\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u0244\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u0244\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u0245\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u0245\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\14\74\1\u0246\15\74\4"+
            "\uffff\1\74\1\uffff\14\74\1\u0246\15\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0247\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0247\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0248\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0248\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u024a\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u024a\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u024d\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u024d\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u024e\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u024e\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u024f\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u024f\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u0250\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u0250\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0251\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u0251\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u0252\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u0252\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u0254\31\74\4\uffff"+
            "\1\74\1\uffff\1\u0254\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u0255\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u0255\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0256\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0256\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\5\74\1\u0258\24\74\4"+
            "\uffff\1\74\1\uffff\5\74\1\u0258\24\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u025a\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u025a\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u025b\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u025b\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u025c\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u025c\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0262\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0262\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\7\74\1\u0266\22\74\4"+
            "\uffff\1\74\1\uffff\7\74\1\u0266\22\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\15\74\1\u0267\14\74\4"+
            "\uffff\1\74\1\uffff\15\74\1\u0267\14\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\13\74\1\u0268\16\74\4"+
            "\uffff\1\74\1\uffff\13\74\1\u0268\16\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0269\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u0269\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\16\74\1\u026b\13\74\4"+
            "\uffff\1\74\1\uffff\16\74\1\u026b\13\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\4\74\1\u0270\25\74\4"+
            "\uffff\1\74\1\uffff\4\74\1\u0270\25\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\2\74\1\u0271\27\74\4"+
            "\uffff\1\74\1\uffff\2\74\1\u0271\27\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u0274\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u0274\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\22\74\1\u0275\7\74\4"+
            "\uffff\1\74\1\uffff\22\74\1\u0275\7\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\1\u0276\31\74\4\uffff"+
            "\1\74\1\uffff\1\u0276\31\74\74\uffff\1\74\10\uffff\27\74\1\uffff"+
            "\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff"+
            "\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff"+
            "\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\u0277"+
            "\1\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1"+
            "\uffff\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74"+
            "\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100"+
            "\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\23\74\1\u0279\6\74\4"+
            "\uffff\1\74\1\uffff\23\74\1\u0279\6\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\24\74\1\u027a\5\74\4"+
            "\uffff\1\74\1\uffff\24\74\1\u027a\5\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\21\74\1\u027c\10\74\4"+
            "\uffff\1\74\1\uffff\21\74\1\u027c\10\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\10\74\1\u027d\21\74\4"+
            "\uffff\1\74\1\uffff\10\74\1\u027d\21\74\74\uffff\1\74\10\uffff"+
            "\27\74\1\uffff\37\74\1\uffff\u0286\74\1\uffff\u1c81\74\14\uffff"+
            "\2\74\61\uffff\2\74\57\uffff\u0120\74\u0a70\uffff\u03f0\74\21"+
            "\uffff\ua7ff\74\u2100\uffff\u04d0\74\40\uffff\u020e\74",
            "\1\74\1\75\1\uffff\12\74\1\76\6\uffff\32\74\4\uffff\1\74\1"+
            "\uffff\32\74\74\uffff\1\74\10\uffff\27\74\1\uffff\37\74\1\uffff"+
            "\u0286\74\1\uffff\u1c81\74\14\uffff\2\74\61\uffff\2\74\57\uffff"+
            "\u0120\74\u0a70\uffff\u03f0\74\21\uffff\ua7ff\74\u2100\uffff"+
            "\u04d0\74\40\uffff\u020e\74",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( WS | BASE | PREFIX | SELECT | DISTINCT | REDUCED | CONSTRUCT | DESCRIBE | ASK | FROM | NAMED | WHERE | ORDER | BY | ASC | DESC | LIMIT | OFFSET | OPTIONAL | GRAPH | UNION | FILTER | A | STR | LANG | LANGMATCHES | DATATYPE | BOUND | SAMETERM | ISIRI | ISURI | ISBLANK | ISLITERAL | REGEX | SUBSTR | TRUE | FALSE | LOAD | CLEAR | DROP | ADD | MOVE | COPY | CREATE | DELETE | INSERT | USING | SILENT | DEFAULT | ALL | DATA | WITH | INTO | TO | AS | GROUP | HAVING | UNDEF | BINDINGS | SERVICE | BIND | MINUS_KEYWORD | IRI | URI | BNODE | RAND | ABS | CEIL | FLOOR | ROUND | CONCAT | STRLEN | UCASE | LCASE | ENCODE_FOR_URI | CONTAINS | STRSTARTS | STRENDS | STRBEFORE | STRAFTER | REPLACE | YEAR | MONTH | DAY | HOURS | MINUTES | SECONDS | TIMEZONE | TZ | NOW | MD5 | SHA1 | SHA256 | SHA384 | SHA512 | COALESCE | IF | STRLANG | STRDT | ISNUMERIC | COUNT | SUM | MIN | MAX | AVG | SAMPLE | GROUP_CONCAT | NOT | IN | EXISTS | SEPARATOR | PNAME_NS | PNAME_LN | BLANK_NODE_LABEL | VAR1 | VAR2 | LANGTAG | INTEGER | DECIMAL | DOUBLE | INTEGER_POSITIVE | DECIMAL_POSITIVE | DOUBLE_POSITIVE | INTEGER_NEGATIVE | DECIMAL_NEGATIVE | DOUBLE_NEGATIVE | STRING_LITERAL1 | STRING_LITERAL2 | STRING_LITERAL_LONG1 | STRING_LITERAL_LONG2 | IRI_REF | COMMENT | REFERENCE | LESS_EQUAL | GREATER_EQUAL | NOT_EQUAL | AND | OR | INVERSE | OPEN_BRACE | CLOSE_BRACE | OPEN_CURLY_BRACE | CLOSE_CURLY_BRACE | OPEN_SQUARE_BRACKET | CLOSE_SQUARE_BRACKET | SEMICOLON | DOT | PLUS | MINUS | ASTERISK | QUESTION_MARK | COMMA | NEGATION | DIVIDE | EQUAL | GREATER | PIPE | ANY );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_36 = input.LA(1);

                        s = -1;
                        if ( ((LA37_36>='\u0000' && LA37_36<='\uFFFF')) ) {s = 149;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_34 = input.LA(1);

                        s = -1;
                        if ( (LA37_34=='\"') ) {s = 145;}

                        else if ( ((LA37_34>='\u0000' && LA37_34<='\t')||(LA37_34>='\u000B' && LA37_34<='\f')||(LA37_34>='\u000E' && LA37_34<='!')||(LA37_34>='#' && LA37_34<='\uFFFF')) ) {s = 146;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_33 = input.LA(1);

                        s = -1;
                        if ( (LA37_33=='\'') ) {s = 143;}

                        else if ( ((LA37_33>='\u0000' && LA37_33<='\t')||(LA37_33>='\u000B' && LA37_33<='\f')||(LA37_33>='\u000E' && LA37_33<='&')||(LA37_33>='(' && LA37_33<='\uFFFF')) ) {s = 144;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_0 = input.LA(1);

                        s = -1;
                        if ( ((LA37_0>='\t' && LA37_0<='\n')||LA37_0=='\r'||LA37_0==' ') ) {s = 1;}

                        else if ( (LA37_0=='B'||LA37_0=='b') ) {s = 2;}

                        else if ( (LA37_0=='P'||LA37_0=='p') ) {s = 3;}

                        else if ( (LA37_0=='S'||LA37_0=='s') ) {s = 4;}

                        else if ( (LA37_0=='D'||LA37_0=='d') ) {s = 5;}

                        else if ( (LA37_0=='R'||LA37_0=='r') ) {s = 6;}

                        else if ( (LA37_0=='C'||LA37_0=='c') ) {s = 7;}

                        else if ( (LA37_0=='a') ) {s = 8;}

                        else if ( (LA37_0=='F'||LA37_0=='f') ) {s = 9;}

                        else if ( (LA37_0=='N'||LA37_0=='n') ) {s = 10;}

                        else if ( (LA37_0=='W'||LA37_0=='w') ) {s = 11;}

                        else if ( (LA37_0=='O'||LA37_0=='o') ) {s = 12;}

                        else if ( (LA37_0=='L'||LA37_0=='l') ) {s = 13;}

                        else if ( (LA37_0=='G'||LA37_0=='g') ) {s = 14;}

                        else if ( (LA37_0=='U'||LA37_0=='u') ) {s = 15;}

                        else if ( (LA37_0=='A') ) {s = 16;}

                        else if ( (LA37_0=='I'||LA37_0=='i') ) {s = 17;}

                        else if ( (LA37_0=='T'||LA37_0=='t') ) {s = 18;}

                        else if ( (LA37_0=='M'||LA37_0=='m') ) {s = 19;}

                        else if ( (LA37_0=='H'||LA37_0=='h') ) {s = 20;}

                        else if ( (LA37_0=='E'||LA37_0=='e') ) {s = 21;}

                        else if ( (LA37_0=='Y'||LA37_0=='y') ) {s = 22;}

                        else if ( ((LA37_0>='J' && LA37_0<='K')||LA37_0=='Q'||LA37_0=='V'||LA37_0=='X'||LA37_0=='Z'||(LA37_0>='j' && LA37_0<='k')||LA37_0=='q'||LA37_0=='v'||LA37_0=='x'||LA37_0=='z'||(LA37_0>='\u00C0' && LA37_0<='\u00D6')||(LA37_0>='\u00D8' && LA37_0<='\u00F6')||(LA37_0>='\u00F8' && LA37_0<='\u02FF')||(LA37_0>='\u0370' && LA37_0<='\u037D')||(LA37_0>='\u037F' && LA37_0<='\u1FFF')||(LA37_0>='\u200C' && LA37_0<='\u200D')||(LA37_0>='\u2070' && LA37_0<='\u218F')||(LA37_0>='\u2C00' && LA37_0<='\u2FEF')||(LA37_0>='\u3001' && LA37_0<='\uD7FF')||(LA37_0>='\uF900' && LA37_0<='\uFDCF')||(LA37_0>='\uFDF0' && LA37_0<='\uFFFD')) ) {s = 23;}

                        else if ( (LA37_0==':') ) {s = 24;}

                        else if ( (LA37_0=='_') ) {s = 25;}

                        else if ( (LA37_0=='?') ) {s = 26;}

                        else if ( (LA37_0=='$') ) {s = 27;}

                        else if ( (LA37_0=='@') ) {s = 28;}

                        else if ( ((LA37_0>='0' && LA37_0<='9')) ) {s = 29;}

                        else if ( (LA37_0=='.') ) {s = 30;}

                        else if ( (LA37_0=='+') ) {s = 31;}

                        else if ( (LA37_0=='-') ) {s = 32;}

                        else if ( (LA37_0=='\'') ) {s = 33;}

                        else if ( (LA37_0=='\"') ) {s = 34;}

                        else if ( (LA37_0=='<') ) {s = 35;}

                        else if ( (LA37_0=='#') ) {s = 36;}

                        else if ( (LA37_0=='^') ) {s = 37;}

                        else if ( (LA37_0=='>') ) {s = 38;}

                        else if ( (LA37_0=='!') ) {s = 39;}

                        else if ( (LA37_0=='&') ) {s = 40;}

                        else if ( (LA37_0=='|') ) {s = 41;}

                        else if ( (LA37_0=='(') ) {s = 42;}

                        else if ( (LA37_0==')') ) {s = 43;}

                        else if ( (LA37_0=='{') ) {s = 44;}

                        else if ( (LA37_0=='}') ) {s = 45;}

                        else if ( (LA37_0=='[') ) {s = 46;}

                        else if ( (LA37_0==']') ) {s = 47;}

                        else if ( (LA37_0==';') ) {s = 48;}

                        else if ( (LA37_0=='*') ) {s = 49;}

                        else if ( (LA37_0==',') ) {s = 50;}

                        else if ( (LA37_0=='/') ) {s = 51;}

                        else if ( (LA37_0=='=') ) {s = 52;}

                        else if ( ((LA37_0>='\u0000' && LA37_0<='\b')||(LA37_0>='\u000B' && LA37_0<='\f')||(LA37_0>='\u000E' && LA37_0<='\u001F')||LA37_0=='%'||LA37_0=='\\'||LA37_0=='`'||(LA37_0>='~' && LA37_0<='\u00BF')||LA37_0=='\u00D7'||LA37_0=='\u00F7'||(LA37_0>='\u0300' && LA37_0<='\u036F')||LA37_0=='\u037E'||(LA37_0>='\u2000' && LA37_0<='\u200B')||(LA37_0>='\u200E' && LA37_0<='\u206F')||(LA37_0>='\u2190' && LA37_0<='\u2BFF')||(LA37_0>='\u2FF0' && LA37_0<='\u3000')||(LA37_0>='\uD800' && LA37_0<='\uF8FF')||(LA37_0>='\uFDD0' && LA37_0<='\uFDEF')||(LA37_0>='\uFFFE' && LA37_0<='\uFFFF')) ) {s = 53;}

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}