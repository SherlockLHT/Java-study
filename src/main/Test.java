package main;

import file.FileOperator;

public class Test {
	public static void main(String[] args) {
		String path = "C:/Users/Administrator/Desktop/��ӡ���ļ�����";
		
		FileOperator file_operator = new FileOperator();
		file_operator.TraverseFolder(path);
	}
}
