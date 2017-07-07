
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Jul 07 14:25:10 BRT 2017
//----------------------------------------------------

package compiler;

import java.util.*;
import java.io.*;
import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Jul 07 14:25:10 BRT 2017
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\026\000\002\002\004\000\002\002\007\000\002\002" +
    "\003\000\002\003\004\000\002\003\003\000\002\004\012" +
    "\000\002\005\005\000\002\005\003\000\002\006\003\000" +
    "\002\006\005\000\002\007\003\000\002\007\003\000\002" +
    "\007\005\000\002\007\012\000\002\007\006\000\002\011" +
    "\003\000\002\011\003\000\002\011\003\000\002\010\003" +
    "\000\002\010\003\000\002\010\003\000\002\010\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\006\011\006\026\005\001\002\000\004\002" +
    "\uffff\001\002\000\004\014\056\001\002\000\004\026\013" +
    "\001\002\000\004\002\012\001\002\000\006\002\ufffd\011" +
    "\006\001\002\000\004\002\ufffe\001\002\000\004\002\001" +
    "\001\002\000\004\021\014\001\002\000\004\026\015\001" +
    "\002\000\006\022\ufffa\024\054\001\002\000\004\022\017" +
    "\001\002\000\004\014\020\001\002\000\010\006\023\026" +
    "\021\027\024\001\002\000\034\007\ufff6\010\ufff6\012\ufff6" +
    "\013\ufff6\014\ufff6\015\ufff6\016\ufff6\017\ufff6\020\ufff6\021" +
    "\046\022\ufff6\023\ufff6\024\ufff6\001\002\000\014\015\036" +
    "\016\032\017\031\020\034\023\045\001\002\000\010\006" +
    "\023\026\021\027\024\001\002\000\032\007\ufff7\010\ufff7" +
    "\012\ufff7\013\ufff7\014\ufff7\015\ufff7\016\ufff7\017\ufff7\020" +
    "\ufff7\022\ufff7\023\ufff7\024\ufff7\001\002\000\020\012\027" +
    "\013\030\014\033\015\036\016\032\017\031\020\034\001" +
    "\002\000\010\006\023\026\021\027\024\001\002\000\010" +
    "\006\ufff2\026\ufff2\027\ufff2\001\002\000\010\006\ufff1\026" +
    "\ufff1\027\ufff1\001\002\000\010\006\uffed\026\uffed\027\uffed" +
    "\001\002\000\010\006\uffee\026\uffee\027\uffee\001\002\000" +
    "\010\006\ufff0\026\ufff0\027\ufff0\001\002\000\010\006\uffec" +
    "\026\uffec\027\uffec\001\002\000\010\006\023\026\021\027" +
    "\024\001\002\000\010\006\uffef\026\uffef\027\uffef\001\002" +
    "\000\032\007\ufff5\010\ufff5\012\ufff5\013\ufff5\014\ufff5\015" +
    "\036\016\032\017\031\020\034\022\ufff5\023\ufff5\024\ufff5" +
    "\001\002\000\014\007\041\015\036\016\032\017\031\020" +
    "\034\001\002\000\010\006\023\026\021\027\024\001\002" +
    "\000\014\010\043\015\036\016\032\017\031\020\034\001" +
    "\002\000\010\006\023\026\021\027\024\001\002\000\032" +
    "\007\ufff4\010\ufff4\012\ufff4\013\ufff4\014\ufff4\015\036\016" +
    "\032\017\031\020\034\022\ufff4\023\ufff4\024\ufff4\001\002" +
    "\000\006\002\ufffc\011\ufffc\001\002\000\010\006\023\026" +
    "\021\027\024\001\002\000\016\015\036\016\032\017\031" +
    "\020\034\022\ufff9\024\ufff9\001\002\000\006\022\051\024" +
    "\052\001\002\000\032\007\ufff3\010\ufff3\012\ufff3\013\ufff3" +
    "\014\ufff3\015\ufff3\016\ufff3\017\ufff3\020\ufff3\022\ufff3\023" +
    "\ufff3\024\ufff3\001\002\000\010\006\023\026\021\027\024" +
    "\001\002\000\016\015\036\016\032\017\031\020\034\022" +
    "\ufff8\024\ufff8\001\002\000\004\026\015\001\002\000\004" +
    "\022\ufffb\001\002\000\004\027\057\001\002\000\004\023" +
    "\060\001\002\000\006\011\006\026\005\001\002\000\004" +
    "\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\010\002\006\003\003\004\007\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\003\010\004\007\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\005\015" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\007\021\001\001\000\002\001\001\000\004" +
    "\010\034\001\001\000\004\007\024\001\001\000\002\001" +
    "\001\000\006\010\034\011\025\001\001\000\004\007\037" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\007\036\001\001\000\002\001\001\000\004\010" +
    "\034\001\001\000\004\010\034\001\001\000\004\007\041" +
    "\001\001\000\004\010\034\001\001\000\004\007\043\001" +
    "\001\000\004\010\034\001\001\000\002\001\001\000\006" +
    "\006\047\007\046\001\001\000\004\010\034\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\007\052\001\001" +
    "\000\004\010\034\001\001\000\004\005\054\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\002\060\003\003\004\007\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public static void main(String[] args) throws Exception{
        try {
			Parser parser = new Parser();
			parser.setScanner(new Lexer(new FileReader (args[0])));
            parser.parse();
        } catch ( IOException exception ) {
            throw new Error( "N�o conseguiu abrir arquivo." );
        }
    }

    public void syntax_error (Symbol s) {
        report_error("Erro de sintaxe na linha: " + (s.right+1) + " e na coluna: " + s.left + ". Texto: -- " +
        s.value+ " --", null);
    }
    
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception {
        System.out.println("\nOcorreu um erro na linha " + (s.right)+ ", coluna "+s.left+". Identificador " +
        s.value + " n�o reconhecido.");
	}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // OP_ARIT ::= DIVISAO 
            {
              No RESULT =null;
		int divisaoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int divisaoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token divisao = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(divisao);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OP_ARIT",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // OP_ARIT ::= MULTIPLICACAO 
            {
              No RESULT =null;
		int multiplicacaoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int multiplicacaoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token multiplicacao = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(multiplicacao);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OP_ARIT",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // OP_ARIT ::= SUBTRACAO 
            {
              No RESULT =null;
		int subtracaoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int subtracaoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token subtracao = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(subtracao);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OP_ARIT",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // OP_ARIT ::= SOMA 
            {
              No RESULT =null;
		int somaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int somaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token soma = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(soma);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OP_ARIT",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // OP_REL ::= IGUAL 
            {
              No RESULT =null;
		int igualleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int igualright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token igual = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(igual);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OP_REL",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // OP_REL ::= MENOR 
            {
              No RESULT =null;
		int menorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int menorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token menor = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(menor);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OP_REL",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // OP_REL ::= MAIOR 
            {
              No RESULT =null;
		int maiorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int maiorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token maior = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(maior);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("OP_REL",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // EXP ::= IDENTIFICADOR ABRE_PARENTESIS SEQ FECHA_PARENTESIS 
            {
              No RESULT =null;
		int identificadorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int identificadorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Token identificador = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int abre_parentesisleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int abre_parentesisright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token abre_parentesis = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int SEQleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int SEQright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		No SEQ = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int fecha_parentesisleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int fecha_parentesisright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token fecha_parentesis = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(identificador);
										no.addFilho(abre_parentesis);
										no.addFilho(SEQ);
										no.addFilho(fecha_parentesis);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXP",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // EXP ::= SE EXP OP_REL EXP ENTAO EXP SENAO EXP 
            {
              No RESULT =null;
		int seleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int seright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		Token se = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int expressao1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int expressao1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		No expressao1 = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int OP_RELleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int OP_RELright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		No OP_REL = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int expressao2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int expressao2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		No expressao2 = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int entaoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int entaoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Token entao = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int expressao3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int expressao3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		No expressao3 = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int senaoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int senaoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Token senao = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int expressao4left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int expressao4right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		No expressao4 = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(se);
										no.addFilho(expressao1);
										no.addFilho(OP_REL);
										no.addFilho(expressao2);
										no.addFilho(entao);
										no.addFilho(expressao3);
										no.addFilho(senao);
										no.addFilho(expressao4);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXP",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // EXP ::= EXP OP_ARIT EXP 
            {
              No RESULT =null;
		int expressao1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int expressao1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		No expressao1 = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int OP_ARITleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int OP_ARITright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		No OP_ARIT = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int expressao2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int expressao2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		No expressao2 = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(expressao1);
										no.addFilho(OP_ARIT);
										no.addFilho(expressao2);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXP",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // EXP ::= IDENTIFICADOR 
            {
              No RESULT =null;
		int identificadorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int identificadorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token identificador = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(identificador);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXP",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // EXP ::= INTEIRO 
            {
              No RESULT =null;
		int inteiroleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int inteiroright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token inteiro = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(inteiro);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("EXP",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SEQ ::= SEQ VIRGULA EXP 
            {
              No RESULT =null;
		int SEQleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int SEQright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		No SEQ = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int virgulaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int virgularight = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Token virgula = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int EXPleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int EXPright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		No EXP = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(SEQ);
										no.addFilho(virgula);
										no.addFilho(EXP);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SEQ",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SEQ ::= EXP 
            {
              No RESULT =null;
		int EXPleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int EXPright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		No EXP = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(EXP);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("SEQ",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // ARGS ::= IDENTIFICADOR 
            {
              No RESULT =null;
		int identificadorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int identificadorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token identificador = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(identificador);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ARGS",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // ARGS ::= IDENTIFICADOR VIRGULA ARGS 
            {
              No RESULT =null;
		int identificadorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int identificadorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token identificador = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int virgulaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int virgularight = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Token virgula = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int ARGSleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int ARGSright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		No ARGS = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(identificador);
										no.addFilho(virgula);
										no.addFilho(ARGS);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ARGS",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // D ::= DEF IDENTIFICADOR ABRE_PARENTESIS ARGS FECHA_PARENTESIS IGUAL EXP PONTO_E_VIRGULA 
            {
              No RESULT =null;
		int defleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int defright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		Token def = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int identificadorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int identificadorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Token identificador = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int abre_parentesisleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int abre_parentesisright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Token abre_parentesis = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int ARGSleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int ARGSright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		No ARGS = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int fecha_parentesisleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int fecha_parentesisright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Token fecha_parentesis = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int igualleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int igualright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token igual = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int EXPleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int EXPright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		No EXP = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int ponto_e_virgulaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int ponto_e_virgularight = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token ponto_e_virgula = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(def);
										no.addFilho(identificador);
										no.addFilho(abre_parentesis);
										no.addFilho(ARGS);
										no.addFilho(fecha_parentesis);
										no.addFilho(igual);
										no.addFilho(EXP);
										no.addFilho(ponto_e_virgula);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("D",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // I ::= D 
            {
              No RESULT =null;
		int Dleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int Dright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		No D = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(D);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("I",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // I ::= D I 
            {
              No RESULT =null;
		int Dleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int Dright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		No D = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int Ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int Iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		No I = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(D);
										no.addFilho(I);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("I",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // P ::= I 
            {
              No RESULT =null;
		int Ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int Iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		No I = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(I);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("P",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // P ::= IDENTIFICADOR IGUAL INTEIRO PONTO_E_VIRGULA P 
            {
              No RESULT =null;
		int identificadorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int identificadorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Token identificador = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int igualleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int igualright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Token igual = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int inteiroleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int inteiroright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Token inteiro = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int ponto_e_virgulaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int ponto_e_virgularight = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Token ponto_e_virgula = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int Pleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int Pright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		No P = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
										No no = new No(identificador);
										no.addFilho(new No(igual));
										no.addFilho(new No(inteiro));
										no.addFilho(new No(ponto_e_virgula));
										no.addFilho(P);
										RESULT = no;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("P",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= P EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		No start_val = (No)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

