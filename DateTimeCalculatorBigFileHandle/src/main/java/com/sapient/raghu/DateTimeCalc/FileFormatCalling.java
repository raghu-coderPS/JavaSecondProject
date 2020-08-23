package com.sapient.raghu.DateTimeCalc;

public class FileFormatCalling {
public void fileformat(String writeline)
{
	FileHistoryOfOuputs format=new FileHistoryOfOuputs();
	String fileName;
	fileName="C:/Users/DELL/eclipse-workspace/com.sapient.raghu.DateTimeCalc/src/main/java/com/sapient/raghu/DateTimeCalc/history100.txt";
	format.FileSessionHistory(fileName,writeline);
	fileName="C:/Users/DELL/eclipse-workspace/com.sapient.raghu.DateTimeCalc/src/main/java/com/sapient/raghu/DateTimeCalc/history100.csv";
	format.FileSessionHistory(fileName,writeline);
	fileName="C:/Users/DELL/eclipse-workspace/com.sapient.raghu.DateTimeCalc/src/main/java/com/sapient/raghu/DateTimeCalc/history100.json";
	format.FileSessionHistory(fileName,writeline);
	fileName="C:/Users/DELL/eclipse-workspace/com.sapient.raghu.DateTimeCalc/src/main/java/com/sapient/raghu/DateTimeCalc/history100.xml";
	format.FileSessionHistory(fileName,writeline);
}
}
