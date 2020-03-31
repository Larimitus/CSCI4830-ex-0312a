package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
	  extractedMethod(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	  extractedMethod(edgeList, p);
      // other implementation
      return null;
   }

   @SuppressWarnings({ "unchecked", "rawtypes" })
   void extractedMethod(List listOfType, String p) {
	   for (GraphType typeObj : (List<GraphType>) listOfType) {
		   if (typeObj.contains(p)) {
			   System.out.println(typeObj);
		   }
	   }
   }
}

class GraphType {
	String name;
	
	public boolean contains(String p) {
      return name.contains(p);
   }
}

class Node extends GraphType { }

class Edge extends GraphType { }	
