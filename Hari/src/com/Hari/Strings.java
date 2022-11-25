package com.Hari;

public class Strings {
	public static void main(String[] args)
    {
		System.out.println("\tThis text is one tab in.");
		System.out.println("\tThis text is one tab in.\r\n");
		
		String textblock = """
			                This is a text inside a
			                text block.
			                You can use ""quotes"" in here
			                without escaping them.
			                """;
		System.out.println(textblock);
		
		String textblock1 = """
                This is a Java text block
                """;

String textblock2 = """
                This is a Java text block
              """;

String textblock3 = """
                This is a Java text block
 """;

System.out.println(textblock1);
System.out.println(textblock2);
System.out.println(textblock3);
    }
}
