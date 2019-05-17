/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replace.parameter.with.explicit.methods;

/**
 *
 * @author joelb
 */
public class ReplaceParameterWithExplicitMethods {

   void setValue(String name, int value) {
  if (name.equals("name")) {
    name = value;
    return;
  }
  if (name.equals("age")) {
    age = value;
    return;
  }
  Assert.shouldNeverReachHere();
}
    
}
