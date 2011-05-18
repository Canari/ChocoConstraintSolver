package main;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;


public class Example {
       public static void main(String[] args) {
               bMethod();
       }

       public static void aMethod() {
               // Build model
               Model model = new CPModel();
               // Declare every letter as a variable
               IntegerVariable d = Choco.makeIntVar("d", 0, 9, Options.V_ENUM);
               IntegerVariable o = Choco.makeIntVar("o", 0, 9, Options.V_ENUM);
               IntegerVariable n = Choco.makeIntVar("n", 0, 9, Options.V_ENUM);
               IntegerVariable a = Choco.makeIntVar("a", 0, 9, Options.V_ENUM);
               IntegerVariable l = Choco.makeIntVar("l", 0, 9, Options.V_ENUM);
               IntegerVariable g = Choco.makeIntVar("g", 0, 9, Options.V_ENUM);
               IntegerVariable e = Choco.makeIntVar("e", 0, 9, Options.V_ENUM);
               IntegerVariable r = Choco.makeIntVar("r", 0, 9, Options.V_ENUM);
               IntegerVariable b = Choco.makeIntVar("b", 0, 9, Options.V_ENUM);
               IntegerVariable t = Choco.makeIntVar("t", 0, 9, Options.V_ENUM);
               // Declare every name as a variable
               IntegerVariable donald = Choco.makeIntVar("donald", 0, 1000000,Options.V_BOUND);
               IntegerVariable gerald = Choco.makeIntVar("gerald", 0, 1000000,Options.V_BOUND);
               IntegerVariable robert = Choco.makeIntVar("robert", 0, 1000000,Options.V_BOUND);
               // Array of coefficients
               int[] c = new int[]{100000, 10000, 1000, 100, 10, 1};
               // Declare every combination of letter as an integer expression
               IntegerExpressionVariable donaldLetters = Choco.scalar(new IntegerVariable[]{d,o,n,a,l,d}, c);
               IntegerExpressionVariable geraldLetters = Choco.scalar(new IntegerVariable[]{g,e,r,a,l,d}, c);
               IntegerExpressionVariable robertLetters = Choco.scalar(new IntegerVariable[]{r,o,b,e,r,t}, c);
               // Add Choco.equality between name and letters combination
               model.addConstraint(Choco.eq(donaldLetters, donald));
               model.addConstraint(Choco.eq(geraldLetters, gerald));
               model.addConstraint(Choco.eq(robertLetters, robert));
               // Add constraint name sum
               model.addConstraint(Choco.eq(Choco.plus(donald, gerald), robert));
               // Add constraint of all different letters.
               model.addConstraint(Choco.allDifferent(new IntegerVariable[]{d,o,n,a,l,g,e,r,b,t}));
               // Build a solver, read the model and solve it
               Solver s = new CPSolver();
               s.read(model);
               s.solve();
               // Print name value
               System.out.println("donald = " + s.getVar(donald).getVal());
               System.out.println("gerald = " + s.getVar(gerald).getVal());
               System.out.println("robert = " + s.getVar(robert).getVal());
       }

       public static void bMethod() {
               // Build model
               Model model = new CPModel();
               // Declare every letter as a variable
               IntegerVariable d = Choco.makeIntVar("d", 0, 9, Options.V_ENUM);
               IntegerVariable o = Choco.makeIntVar("o", 0, 9, Options.V_ENUM);
               IntegerVariable n = Choco.makeIntVar("n", 0, 9, Options.V_ENUM);
               IntegerVariable a = Choco.makeIntVar("a", 0, 9, Options.V_ENUM);
               IntegerVariable l = Choco.makeIntVar("l", 0, 9, Options.V_ENUM);
               IntegerVariable g = Choco.makeIntVar("g", 0, 9, Options.V_ENUM);
               IntegerVariable e = Choco.makeIntVar("e", 0, 9, Options.V_ENUM);
               IntegerVariable r = Choco.makeIntVar("r", 0, 9, Options.V_ENUM);
               IntegerVariable b = Choco.makeIntVar("b", 0, 9, Options.V_ENUM);
               IntegerVariable t = Choco.makeIntVar("t", 0, 9, Options.V_ENUM);

               // Array of coefficients
//	              int[] c = new int[]{1};

               // Declare every combination of letter as an integer expression
//	              IntegerExpressionVariable dLetter = Choco.Choco.scalar(new IntegerVariable[]{d}, new int[]{1});
//	              IntegerExpressionVariable tLetter = Choco.Choco.scalar(new IntegerVariable[]{t}, new int[]{1});
//	              IntegerExpressionVariable lLetter = Choco.Choco.scalar(new IntegerVariable[]{l}, new int[]{10});
//	              IntegerExpressionVariable rLetter = Choco.Choco.scalar(new IntegerVariable[]{r}, new int[]{10});
//	              IntegerExpressionVariable aLetter = Choco.Choco.scalar(new IntegerVariable[]{a}, new int[]{100});
//	              IntegerExpressionVariable eLetter = Choco.Choco.scalar(new IntegerVariable[]{e}, new int[]{100});

               // Add Choco.equality between name and letters combination
//	              model.addConstraint(Choco.Choco.eq(dLetter, d));
//	              model.addConstraint(Choco.Choco.eq(tLetter, t));
//	              model.addConstraint(Choco.Choco.eq(lLetter, l));
//	              model.addConstraint(Choco.Choco.eq(rLetter, r));

//             IntegerExpressionVariable donaldLetters = Choco.scalar(new IntegerVariable[]{d,o,n,a,l,d}, c);
//             IntegerExpressionVariable geraldLetters = Choco.scalar(new IntegerVariable[]{g,e,r,a,l,d}, c);
//             IntegerExpressionVariable robertLetters = Choco.scalar(new IntegerVariable[]{r,o,b,e,r,t}, c);
               
               
               // Add constraint name sum
               // AAAAAAAAAAAAAAA
//               model.addConstraint(Choco.eq(Choco.plus(d, d), t));
//               model.addConstraint(Choco.ifOnlyIf(Choco.gt(Choco.plus(d, d), 9), Choco.and(Choco.eq(Choco.plus(d, d), Choco.plus(t, 10)), Choco.eq(r, Choco.plus(r, 1)))));
//               
//               model.addConstraint(Choco.eq(Choco.plus(l, l), r));
//               model.addConstraint(Choco.ifOnlyIf(Choco.gt(Choco.plus(l, l), 9), Choco.and(Choco.eq(Choco.plus(l, l), Choco.plus(r, 10)), Choco.eq(e, Choco.plus(e, 1)))));
//               
//               model.addConstraint(Choco.eq(Choco.plus(a, a), e));
//               model.addConstraint(Choco.ifOnlyIf(Choco.gt(Choco.plus(a, a), 9), Choco.and(Choco.eq(Choco.plus(a, a), Choco.plus(e, 10)), Choco.eq(b, Choco.plus(b, 1)))));
//               
//               model.addConstraint(Choco.eq(Choco.plus(n, r), b));
//               model.addConstraint(Choco.ifOnlyIf(Choco.gt(Choco.plus(n, r), 9), Choco.and(Choco.eq(Choco.plus(n, r), Choco.plus(b, 10)), Choco.eq(o, Choco.plus(o, 1)))));
//               
//               model.addConstraint(Choco.eq(Choco.plus(o, e), o));
//               model.addConstraint(Choco.ifOnlyIf(Choco.gt(Choco.plus(o, e), 9), Choco.and(Choco.eq(Choco.plus(o, e), Choco.plus(o, 10)), Choco.eq(r, Choco.plus(r, 2)))));
//               
//               model.addConstraint(Choco.eq(Choco.plus(d, g), r));
//               model.addConstraint(Choco.ifOnlyIf(Choco.gt(Choco.plus(d, g), 9), Choco.and(Choco.eq(Choco.plus(d, g), Choco.plus(r, 10)))));
               
               
               // BBBBBBBBBBBBBBBBBBB
//               model.addConstraint(Choco.eq(Choco.plus(d, d), t));
//               model.addConstraint(Choco.eq(Choco.plus(l, l), r));
//               model.addConstraint(Choco.eq(Choco.plus(a, a), e));
//               model.addConstraint(Choco.eq(Choco.plus(n, r), b));
//               model.addConstraint(Choco.eq(Choco.plus(o, e), o));
//               model.addConstraint(Choco.eq(Choco.plus(d, g), r));
//               
//               model.addConstraint(Choco.ifOnlyIf(Choco.gt(Choco.plus(d, d), 9), Choco.and(Choco.eq(Choco.plus(d, d), Choco.plus(t, 10)), Choco.eq(r, Choco.plus(r, 1)))));               
//               model.addConstraint(Choco.ifOnlyIf(Choco.gt(Choco.plus(l, l), 9), Choco.and(Choco.eq(Choco.plus(l, l), Choco.plus(r, 10)), Choco.eq(e, Choco.plus(e, 1)))));
//               model.addConstraint(Choco.ifOnlyIf(Choco.gt(Choco.plus(a, a), 9), Choco.and(Choco.eq(Choco.plus(a, a), Choco.plus(e, 10)), Choco.eq(b, Choco.plus(b, 1)))));
//               model.addConstraint(Choco.ifOnlyIf(Choco.gt(Choco.plus(n, r), 9), Choco.and(Choco.eq(Choco.plus(n, r), Choco.plus(b, 10)), Choco.eq(o, Choco.plus(o, 1)))));
//               model.addConstraint(Choco.ifOnlyIf(Choco.gt(Choco.plus(o, e), 9), Choco.and(Choco.eq(Choco.plus(o, e), Choco.plus(o, 10)), Choco.eq(r, Choco.plus(r, 2)))));
//               model.addConstraint(Choco.ifOnlyIf(Choco.gt(Choco.plus(d, g), 9), Choco.and(Choco.eq(Choco.plus(d, g), Choco.plus(r, 10)))));
               
               
               // CCCCCCCCCCCCCCCCCCCCC
               model.addConstraint(Choco.ifThenElse(Choco.gt(Choco.plus(d, d), 9), Choco.and(Choco.eq(Choco.plus(d, d), Choco.plus(t, 10)), Choco.eq(r, Choco.plus(r, 1))), Choco.eq(Choco.plus(d, d), t)));               
               model.addConstraint(Choco.ifThenElse(Choco.gt(Choco.plus(l, l), 9), Choco.and(Choco.eq(Choco.plus(l, l), Choco.plus(r, 10)), Choco.eq(e, Choco.plus(e, 1))), Choco.eq(Choco.plus(l, l), r)));
               model.addConstraint(Choco.ifThenElse(Choco.gt(Choco.plus(a, a), 9), Choco.and(Choco.eq(Choco.plus(a, a), Choco.plus(e, 10)), Choco.eq(b, Choco.plus(b, 1))), Choco.eq(Choco.plus(a, a), e)));
               model.addConstraint(Choco.ifThenElse(Choco.gt(Choco.plus(n, r), 9), Choco.and(Choco.eq(Choco.plus(n, r), Choco.plus(b, 10)), Choco.eq(o, Choco.plus(o, 1))), Choco.eq(Choco.plus(n, r), b)));
               //model.addConstraint(Choco.ifThenElse(Choco.gt(Choco.plus(o, e), 9), Choco.and(Choco.eq(Choco.plus(o, e), Choco.plus(o, 10)), Choco.eq(r, Choco.plus(r, 1))), Choco.eq(Choco.plus(o, e), o)));
               model.addConstraint(Choco.ifThenElse(Choco.gt(Choco.plus(d, g), 9), Choco.and(Choco.eq(Choco.plus(d, g), Choco.plus(r, 10))), Choco.eq(Choco.plus(d, g), r)));          

               
               // DDDDDDDDDDDDDDDDDDD
//               model.addConstraint(Choco.eq(Choco.plus(d, d), t));
//               model.addConstraint(Choco.eq(Choco.plus(l, l), r));
//               model.addConstraint(Choco.eq(Choco.plus(a, a), e));
//               model.addConstraint(Choco.eq(Choco.plus(n, r), b));
//	             model.addConstraint(Choco.eq(Choco.plus(o, e), o));
//	             model.addConstraint(Choco.eq(Choco.plus(d, g), r));
               
               // Add constraint of all different letters.
               model.addConstraint(Choco.allDifferent(new IntegerVariable[]{d,o,n,a,l,g,e,r,b,t}));

               // Build a solver, read the model and solve it
               Solver solver = new CPSolver();
               solver.read(model);
               solver.solve();

               // Print name value
               System.out.println("D + D = T  //  " + solver.getVar(d).getVal() + " + " + solver.getVar(d).getVal() + " = " + solver.getVar(t).getVal());
               System.out.println("L + L = R  //  " + solver.getVar(l).getVal() + " + " + solver.getVar(l).getVal() + " = " + solver.getVar(r).getVal());
               System.out.println("A + A = E  //  " + solver.getVar(a).getVal() + " + " + solver.getVar(a).getVal() + " = " + solver.getVar(e).getVal());
               System.out.println("N + R = B  //  " + solver.getVar(n).getVal() + " + " + solver.getVar(r).getVal() + " = " + solver.getVar(b).getVal());
               System.out.println("O + E = O  //  " + solver.getVar(o).getVal() + " + " + solver.getVar(e).getVal() + " = " + solver.getVar(o).getVal());
               System.out.println("D + G = R  //  " + solver.getVar(d).getVal() + " + " + solver.getVar(g).getVal() + " = " + solver.getVar(r).getVal());
       }
}
