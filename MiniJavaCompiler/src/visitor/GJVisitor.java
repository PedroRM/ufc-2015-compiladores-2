//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors must implement this interface.
 */

public interface GJVisitor<R,A> {

   //
   // GJ Auto class visitors
   //

   public R visit(NodeList n, A argu);
   public R visit(NodeListOptional n, A argu);
   public R visit(NodeOptional n, A argu);
   public R visit(NodeSequence n, A argu);
   public R visit(NodeToken n, A argu);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> mainClass()
    * f1 -> ( classDecl() )*
    * f2 -> <EOF>
    */
   public R visit(Program n, A argu);

   /**
    * f0 -> <CLASS>
    * f1 -> <ID>
    * f2 -> <LBRACE>
    * f3 -> <PUBLIC>
    * f4 -> <STATIC>
    * f5 -> <VOID>
    * f6 -> <MAIN>
    * f7 -> <LPAREN>
    * f8 -> <STRING>
    * f9 -> <LBRACK>
    * f10 -> <RBRACK>
    * f11 -> <ID>
    * f12 -> <RPAREN>
    * f13 -> <LBRACE>
    * f14 -> statement()
    * f15 -> <RBRACE>
    * f16 -> <RBRACE>
    */
   public R visit(MainClass n, A argu);

   /**
    * f0 -> <CLASS>
    * f1 -> <ID>
    * f2 -> ( <EXTENDS> <ID> )?
    * f3 -> <LBRACE>
    * f4 -> ( varDecl() )*
    * f5 -> ( methodDecl() )*
    * f6 -> <RBRACE>
    */
   public R visit(ClassDecl n, A argu);

   /**
    * f0 -> type()
    * f1 -> <ID>
    * f2 -> <SEMICOLON>
    */
   public R visit(VarDecl n, A argu);

   /**
    * f0 -> <PUBLIC>
    * f1 -> type()
    * f2 -> <ID>
    * f3 -> <LPAREN>
    * f4 -> ( formalList() )?
    * f5 -> <RPAREN>
    * f6 -> <LBRACE>
    * f7 -> ( varDecl() )*
    * f8 -> ( statement() )*
    * f9 -> <RETURN>
    * f10 -> exp()
    * f11 -> <SEMICOLON>
    * f12 -> <RBRACE>
    */
   public R visit(MethodDecl n, A argu);

   /**
    * f0 -> type()
    * f1 -> <ID>
    * f2 -> ( formalRest() )*
    */
   public R visit(FormalList n, A argu);

   /**
    * f0 -> <COMMA>
    * f1 -> type()
    * f2 -> <ID>
    */
   public R visit(FormalRest n, A argu);

   /**
    * f0 -> <INT> <LBRACK> <RBRACK>
    *       | <BOOL>
    *       | <INT>
    *       | <ID>
    */
   public R visit(Type n, A argu);

   /**
    * f0 -> <LBRACE> ( statement() )* <RBRACE>
    *       | <IF> <LPAREN> exp() <RPAREN> statement() <ELSE> statement()
    *       | <WHILE> <LPAREN> exp() <RPAREN> statement()
    *       | <PRINT> <LPAREN> exp() <RPAREN> <SEMICOLON>
    *       | <ID> <ASSIGNMENT> exp() <SEMICOLON>
    *       | <ID> <LBRACK> exp() <RBRACK> <ASSIGNMENT> exp() <SEMICOLON>
    */
   public R visit(Statement n, A argu);

   /**
    * f0 -> expAux()
    * f1 -> ( op() exp() | <LBRACK> exp() <RBRACK> | <DOT> ( <LENGTH> | <ID> <LPAREN> ( expList() )? <RPAREN> ) )?
    */
   public R visit(Exp n, A argu);

   /**
    * f0 -> <FALSE>
    *       | <TRUE>
    *       | <ID>
    *       | <THIS>
    *       | <NUM>
    *       | <NEW> <ID> <LPAREN> <RPAREN>
    *       | <NEW> <INT> <LBRACK> exp() <RBRACK>
    *       | <LPAREN> exp() <RPAREN>
    *       | <EXCL> exp()
    */
   public R visit(ExpAux n, A argu);

   /**
    * f0 -> exp()
    * f1 -> ( expRest() )*
    */
   public R visit(ExpList n, A argu);

   /**
    * f0 -> <COMMA>
    * f1 -> exp()
    */
   public R visit(ExpRest n, A argu);

   /**
    * f0 -> <AND>
    *       | <SMALLER>
    *       | <PLUS>
    *       | <MINUS>
    *       | <MULTIPLY>
    */
   public R visit(Op n, A argu);

}
