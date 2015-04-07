package Tool;

public class RoundTool {
	
	public static String round(double value,int dotNum){
		String strValue = String.valueOf(value);//Making num into String
		int pos = strValue.indexOf(".");//Position of dot.
		int len = strValue.length();//Length of the num.
		int dotLen = len - 1 - pos;//Length after dot.
		double endValue = 0.0;//var of calculate.
		String endNum = "";//var of saving the result
		if(dotNum < dotLen){
			String cNum = strValue.substring(pos+dotNum+1, pos+dotNum+2);
			int iNum = Integer.valueOf(cNum);
			String sNum = strValue.substring(0,pos+dotNum+1);
			endValue = Double.valueOf(sNum);
			if(iNum >= 5){
				String endPos = "";
				String dotValue = "";
				for(int i = 1;i < dotNum;i++){
					dotValue = dotValue+"0";
				}
				endPos = "0."+dotValue + "1";
				endValue = endValue + Double.valueOf(endPos);
				strValue = String.valueOf(endValue);
				pos = strValue.indexOf(".");
				len = strValue.length();
				dotLen = len - 1 - pos;
				if(dotLen < dotNum){
					for(int i = pos + dotLen + 1;i<pos+dotNum+1;i++){
						endNum = String.valueOf(endValue)+"0";
					}
				}else{
					endNum = String.valueOf(endValue).substring(0, pos+dotNum+1);
				}
			}else{
				endNum = strValue.substring(0, strValue.indexOf("."))+
					strValue.substring(strValue.indexOf("."),strValue.indexOf(".")+dotNum+1);
			}
		}else if(dotNum == dotLen){
			endNum = String.valueOf(value);
		}else{
			for(int i = 1;i <= dotNum - dotLen;i++){
				strValue = strValue + "0";
			}
			endNum = strValue;
		}
		return endNum;
	}
	public static void main(String[] args){
		System.out.println(RoundTool.round(123.121, 2));
		System.out.println(RoundTool.round(123.456789, 3));
		System.out.println(RoundTool.round(123.1231, 3));
		System.out.println(RoundTool.round(123.56,3));
	}
}
