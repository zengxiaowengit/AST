package org.qiuer.ast.pattern;


import org.qiuer.ast.Node;
import org.qiuer.core.Context;
import org.qiuer.exception.IException;

import java.util.List;

public class ArrayPattern extends Pattern {
  String type = "ArrayPattern";
  //[ Pattern | null ];
  List<Node> elements;

  @Override
  public void compile() throws IException {

  }

  @Override
  public Object run(Context context) throws IException {
    return null;
  }
}