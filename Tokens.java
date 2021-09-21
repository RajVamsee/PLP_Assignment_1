package edu.ufl.cise.plpfa21.assignment1;

public class Tokens implements IPLPToken {
	public String input;
	public int pos;
	public int lineCounter;
	public Tokens(String input, int pos,int lineCounter) {
		// TODO Auto-generated constructor stub
		this.input = input;
		this.pos=pos;
		this.lineCounter=lineCounter;
	}

	@Override
	public Kind getKind() {
		// TODO Auto-generated method stub
		String s = input;
		Character c = s.charAt(0);
		String start = c.toString();
		String remain = s.substring(1, s.length());
		Kind myKind;

		if (start.matches("[a-zA-Z_$]") && remain.matches("[a-zA-Z_$0-9]+")) {

			switch (s) {
			// Case statements
			case "var":
				myKind = Kind.KW_VAR;
				System.out.println(myKind);
				break;
			case "val":
				myKind = Kind.KW_VAL;
				System.out.println(myKind);
				break;
			case "fun":
				myKind = Kind.KW_FUN;
				System.out.println(myKind);
				break;
			case "do":
				myKind = Kind.KW_DO;
				System.out.println(myKind);
				break;
			case "end":
				myKind = Kind.KW_END;
				System.out.println(myKind);
				break;
			case "let":
				myKind = Kind.KW_LET;
				System.out.println(myKind);
				break;
			case "switch":
				myKind = Kind.KW_SWITCH;
				System.out.println(myKind);
				break;
			case "case":
				myKind = Kind.KW_CASE;
				System.out.println(myKind);
				break;
			case "default":
				myKind = Kind.KW_DEFAULT;
				System.out.println(myKind);
				break;
			case "if":
				myKind = Kind.KW_IF;
				System.out.println(myKind);
				break;
			case "else":
				myKind = Kind.KW_ELSE;
				System.out.println(myKind);
				break;
			case "while":
				myKind = Kind.KW_WHILE;
				System.out.println(myKind);
				break;
			case "return":
				myKind = Kind.KW_RETURN;
				System.out.println(myKind);
				break;
			case "nil":
				myKind = Kind.KW_NIL;
				System.out.println(myKind);
				break;
			case "true":
				myKind = Kind.KW_TRUE;
				System.out.println(myKind);
				break;
			case "false":
				myKind = Kind.KW_FALSE;
				System.out.println(myKind);
				break;
			case "int":
				myKind = Kind.KW_INT;
				System.out.println(myKind);
				break;
			case "String":
				myKind = Kind.KW_STRING;
				System.out.println(myKind);
				break;
			case "boolean":
				myKind = Kind.KW_BOOLEAN;
				System.out.println(myKind);
				break;
			case "list":
				myKind = Kind.KW_LIST;
				System.out.println(myKind);
				break;
			case "float":
				myKind = Kind.KW_FLOAT;
				System.out.println(myKind);
				break;

			// Default case statement
			default:
				myKind = Kind.IDENTIFIER;
				System.out.println(myKind);
			}
		} else if (s.matches("[0-9]+")) {
			myKind = Kind.INT_LITERAL;
			System.out.println(myKind);
		} else if (start.matches("[a-zA-Z_$]"))
			return Kind.IDENTIFIER;
		else {
			switch (s) {
			// Case statements
			case "=":
				myKind = Kind.ASSIGN;
				System.out.println(myKind);
				break;
			case ",":
				myKind = Kind.COMMA;
				System.out.println(myKind);
				break;
			case ";":
				myKind = Kind.SEMI;
				System.out.println(myKind);
				break;
			case ":":
				myKind = Kind.COLON;
				System.out.println(myKind);
				break;
			case "(":
				myKind = Kind.LPAREN;
				System.out.println(myKind);
				break;
			case ")":
				myKind = Kind.RPAREN;
				System.out.println(myKind);
				break;
			case "[":
				myKind = Kind.LSQUARE;
				System.out.println(myKind);
				break;
			case "]":
				myKind = Kind.RSQUARE;
				System.out.println(myKind);
				break;
			case "&&":
				myKind = Kind.AND;
				System.out.println(myKind);
				break;
			case "||":
				myKind = Kind.OR;
				System.out.println(myKind);
				break;
			case "<":
				myKind = Kind.LT;
				System.out.println(myKind);
				break;
			case ">":
				myKind = Kind.GT;
				System.out.println(myKind);
				break;
			case "==":
				myKind = Kind.EQUALS;
				System.out.println(myKind);
				break;
			case "!=":
				myKind = Kind.NOT_EQUALS;
				System.out.println(myKind);
				break;
			case "!":
				myKind = Kind.BANG;
				System.out.println(myKind);
				break;
			case "+":
				myKind = Kind.PLUS;
				System.out.println(myKind);
				break;
			case "-":
				myKind = Kind.MINUS;
				System.out.println(myKind);
				break;
			case "*":
				myKind = Kind.TIMES;
				System.out.println(myKind);
				break;
			case "/":
				myKind = Kind.DIV;
				System.out.println(myKind);
				break;
			case "\n":
				return Kind.EOF;

			// Default case statement
			default:
				myKind = Kind.STRING_LITERAL;
				System.out.println(myKind);
			}
		}
		return myKind;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub

		return input;
	}

	@Override
	public int getLine() {
		// TODO Auto-generated method stub
		return lineCounter;
	}

	@Override
	public int getCharPositionInLine() {
		// TODO Auto-generated method stub
		return pos;
	}

	@Override
	public String getStringValue() {
		String stringValue=input.substring(1,input.length()-1);
			

		return stringValue;
	}

	@Override
	public int getIntValue() {
		int x=Integer.parseInt(input);
		
		return x;
	}

}
