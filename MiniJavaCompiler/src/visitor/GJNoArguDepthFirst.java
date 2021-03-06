//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * Provides default methods which visit each node in the tree in depth-first
 * order.  Your visitors may extend this class.
 */
public class GJNoArguDepthFirst<R> implements GJNoArguVisitor<R> {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public R visit(NodeList n) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeListOptional n) {
      if ( n.present() ) {
         R _ret=null;
         int _count=0;
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this);
            _count++;
         }
         return _ret;
      }
      else
         return null;
   }

   public R visit(NodeOptional n) {
      if ( n.present() )
         return n.node.accept(this);
      else
         return null;
   }

   public R visit(NodeSequence n) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeToken n) { return null; }

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> mainClass()
    * f1 -> ( classDecl() )*
    * f2 -> <EOF>
    */
   public R visit(Program n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      return _ret;
   }

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
   public R visit(MainClass n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      n.f7.accept(this);
      n.f8.accept(this);
      n.f9.accept(this);
      n.f10.accept(this);
      n.f11.accept(this);
      n.f12.accept(this);
      n.f13.accept(this);
      n.f14.accept(this);
      n.f15.accept(this);
      n.f16.accept(this);
      return _ret;
   }

   /**
    * f0 -> <CLASS>
    * f1 -> <ID>
    * f2 -> ( <EXTENDS> <ID> )?
    * f3 -> <LBRACE>
    * f4 -> ( varDecl() )*
    * f5 -> ( methodDecl() )*
    * f6 -> <RBRACE>
    */
   public R visit(ClassDecl n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      return _ret;
   }

   /**
    * f0 -> type()
    * f1 -> <ID>
    * f2 -> <SEMICOLON>
    */
   public R visit(VarDecl n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      return _ret;
   }

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
   public R visit(MethodDecl n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
      n.f7.accept(this);
      n.f8.accept(this);
      n.f9.accept(this);
      n.f10.accept(this);
      n.f11.accept(this);
      n.f12.accept(this);
      return _ret;
   }

   /**
    * f0 -> type()
    * f1 -> <ID>
    * f2 -> ( formalRest() )*
    */
   public R visit(FormalList n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      return _ret;
   }

   /**
    * f0 -> <COMMA>
    * f1 -> type()
    * f2 -> <ID>
    */
   public R visit(FormalRest n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      return _ret;
   }

   /**
    * f0 -> <INT> <LBRACK> <RBRACK>
    *       | <BOOL>
    *       | <INT>
    *       | <ID>
    */
   public R visit(Type n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> <LBRACE> ( statement() )* <RBRACE>
    *       | <IF> <LPAREN> exp() <RPAREN> statement() <ELSE> statement()
    *       | <WHILE> <LPAREN> exp() <RPAREN> statement()
    *       | <PRINT> <LPAREN> exp() <RPAREN> <SEMICOLON>
    *       | <ID> <ASSIGNMENT> exp() <SEMICOLON>
    *       | <ID> <LBRACK> exp() <RBRACK> <ASSIGNMENT> exp() <SEMICOLON>
    */
   public R visit(Statement n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> expAux()
    * f1 -> ( op() exp() | <LBRACK> exp() <RBRACK> | <DOT> ( <LENGTH> | <ID> <LPAREN> ( expList() )? <RPAREN> ) )?
    */
   public R visit(Exp n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

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
   public R visit(ExpAux n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

   /**
    * f0 -> exp()
    * f1 -> ( expRest() )*
    */
   public R visit(ExpList n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> <COMMA>
    * f1 -> exp()
    */
   public R visit(ExpRest n) {
      R _ret=null;
      n.f0.accept(this);
      n.f1.accept(this);
      return _ret;
   }

   /**
    * f0 -> <AND>
    *       | <SMALLER>
    *       | <PLUS>
    *       | <MINUS>
    *       | <MULTIPLY>
    */
   public R visit(Op n) {
      R _ret=null;
      n.f0.accept(this);
      return _ret;
   }

}
