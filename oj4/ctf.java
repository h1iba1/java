//package oj4;
// import java.io.PrintWriter;
///*    */ import java.nio.charset.StandardCharsets;
///*    */ import java.util.Base64;
//
//public class ctf {
//	
//	public void registerExtenderCallbacks() {
//		/* 11 */     byte[] arr_1 = { 121, 113, 113, 80, 68, 74, 120, 84, 118, 71, 105, 71, 69, 72, 109, 100, 125, 114, 75, 112, 69, 100, 109, 81, 120, 74, 91, 71, 69, 97, 79, 96, 124, 15, 20, 116, 125, 73, 82, 87, 121, 75, 121, 71, 112, 113, 79, 101, 119, 114, 75, 104, 125, 73, 113, 101, 117, 74, 83, 69, 72, 72, 24, 18, 124, 87, 112, 84, 115, 110, 96, 26 };
//		/* 12 */     String a = "";
//		/* 13 */     for (int i = 0; i < arr_1.length; i++) {
//		/* 14 */       if (i % 2 == 0) {
//		/* 15 */         a = a + (char)((arr_1[i] ^ 0x20) - 3);
//		/*    */       } else {
//		/* 17 */         a = a + (char)((arr_1[i] ^ 0x20) + 3);
//		/*    */       } 
//		/*    */     } 
//		/*    */     
//		/* 21 */     String b = "";
//		/* 22 */     byte[] arr_2 = { 116, 75, 121, 86, 70, 96, 101, 99, 72, 101, 117, 73, 69, 74, 117, 73, 70, 70, 101, 80, 125, 117, 117, 87, 108, 101, 79, 83, 71, 112, 101, 73, 72, 101, 117, 73, 69, 74, 116, 68, 71, 100, 75, 73, 108, 100, 125, 14, 69, 74, 113, 13, 68, 116, 28, 82, 124, 116, 91, 77, 71, 101, 78, 68, 69, 15, 124, 68, 116, 75, 121, 86, 70, 96, 101, 113, 71, 116, 79, 13, 125, 112, 101, 77, 69, 70, 101, 82, 71, 116, 20, 73, 70, 74, 28, 14, 70, 86, 101, 16, 124, 117, 79, 87, 111, 68, 82, 104, 117, 117, 75, 13, 125, 116, 24, 87, 68, 116, 28, 82, 70, 86, 101, 71, 124, 116, 23, 68, 124, 74, 120, 68, 71, 16, 109, 77, 71, 101, 117, 73, 69, 70, 101, 77, 69, 70, 101, 104, 124, 117, 125, 69, 111, 96, 101, 110, 72, 117, 117, 76, 69, 15, 23, 68, 69, 16, 108, 68, 120, 75, 121, 70, 72, 112, 23, 104, 102, 73, 79, 83, 71, 112, 101, 69, 69, 101, 113, 83, 108, 100, 113, 69, 69, 70, 101, 14, 70, 15, 120, 68, 116, 75, 121, 86, 70, 96, 101, 113, 71, 116, 79, 13, 125, 112, 101, 99, 69, 75, 117, 73, 70, 75, 101, 86, 68, 117, 113, 73, 108, 98, 121, 72, 68, 117, 117, 77, 69, 15, 23, 68, 71, 100, 27, 68, 68, 116, 24, 13, 125, 116, 71, 86, 124, 117, 117, 73, 108, 101, 71, 77, 71, 100, 74, 68, 72, 116, 28, 14, 70, 70, 101, 97, 118, 112, 101, 87, 72, 117, 113, 13, 125, 116, 19, 80, 108, 100, 125, 83, 69, 100, 91, 83, 71, 86, 101, 13, 68, 100, 120, 68, 69, 100, 79, 82, 68, 86, 101, 70, 125, 116, 91, 83, 71, 86, 101, 13, 69, 86, 101, 74, 68, 116, 24, 72, 108, 100, 28, 14, 71, 96, 101, 81, 69, 16, 109, 73, 111, 68, 82, 104, 68, 101, 117, 13, 70, 101, 112, 19, 111, 86, 28, 84, 69, 16, 109, 13, 70, 16, 71, 77, 125, 15, 71, 73, 70, 70, 24, 82, 125, 117, 116, 83, 124, 75, 121, 86, 70, 96, 28, 72, 69, 15, 113, 14, 69, 116, 121, 82, 71, 100, 105, 13, 68, 116, 28, 82, 111, 15, 117, 73, 70, 15, 87, 13, 69, 16, 100, 83, 71, 100, 28, 83, 69, 101, 112, 83, 125, 117, 75, 13, 125, 116, 24, 72, 125, 117, 108, 104, 102, 74, 79, 74, 108, 101, 79, 83, 71, 112, 101, 16, 124, 116, 24, 13, 108, 101, 117, 76, 125, 112, 101, 74, 69, 100, 105, 75, 111, 96, 101, 81, 124, 117, 79, 70, 125, 112, 101, 18, 69, 16, 120, 68, 124, 15, 105, 82, 108, 101, 113, 73, 125, 112, 101, 13, 68, 100, 120, 68, 125, 117, 109, 86, 69, 16, 109, 87, 108, 101, 101, 69, 125, 15, 120, 26 };
//		/* 23 */     for (int i = 0; i < arr_2.length; i++) {
//		/* 24 */       if (i % 2 == 0) {
//		/* 25 */         b = b + (char)((arr_2[i] ^ 0x20) - 3);
//		/*    */       } else {
//		/* 27 */         b = b + (char)((arr_2[i] ^ 0x20) + 3);
//		/*    */       } 
//		/*    */     } 
//		/*    */     
//		/* 31 */     String c = "";
//		/* 32 */     byte[] arr_3 = { 116, 74, 121, 74, 69, 16, 109, 73, 108, 98, 78, 68, 125, 15, 79, 15, 125, 112, 101, 18, 69, 16, 120, 68, 71, 100, 75, 73, 108, 100, 125, 80, 124, 116, 70, 80, 108, 98, 78, 68, 71, 15, 105, 82, 71, 96, 101, 13, 69, 86, 101, 13, 125, 116, 91, 80, 108, 101, 79, 83, 71, 112, 101, 87, 69, 15, 20, 73, 71, 100, 75, 77, 69, 74, 70, 68, 124, 116, 109, 83, 71, 117, 116, 68, 116, 75, 121, 86, 70, 98, 121, 17, 71, 100, 121, 82, 125, 100, 121, 86, 111, 68, 82, 104, 116, 75, 121, 86, 70, 96, 101, 80, 69, 15, 28, 79, 70, 86, 101, 74, 69, 16, 108, 68, 124, 112, 101, 71, 69, 100, 105, 87, 70, 86, 101, 71, 124, 116, 91, 80, 125, 116, 116, 68, 116, 75, 121, 86, 70, 98, 121, 17, 71, 100, 121, 82, 125, 100, 121, 86, 108, 101, 117, 83, 108, 100, 79, 82, 70, 16, 117, 69, 69, 75, 117, 77, 124, 117, 117, 73, 108, 96, 75, 16, 68, 117, 117, 76, 108, 100, 24, 83, 108, 100, 113, 83, 69, 75, 113, 13, 70, 75, 121, 71, 71, 100, 28, 86, 108, 101, 101, 69, 70, 74, 105, 81, 125, 117, 117, 73, 70, 75, 112, 77, 108, 100, 105, 82, 125, 96, 101, 13, 68, 100, 121, 82, 108, 100, 113, 69, 69, 100, 91, 87, 108, 101, 109, 73, 125, 15, 79, 87, 71, 100, 121, 86, 117, 117, 75, 13, 125, 116, 24, 72, 125, 117, 109, 97, 124, 116, 91, 80, 124, 74, 105, 71, 68, 16, 112, 76, 110, 112, 101, 83, 69, 70, 101, 13, 68, 100, 79, 87, 108, 100, 28, 70, 68, 74, 121, 71, 71, 96, 101, 84, 124, 117, 113, 87, 68, 116, 24, 75, 108, 100, 79, 82, 108, 100, 104, 68, 108, 74, 113, 69, 69, 100, 91, 70, 124, 116, 113, 79, 70, 86, 108, 68, 69, 15, 109, 78, 125, 116, 113, 13, 111, 68, 82, 104, 121, 100, 75, 77, 69, 74, 86, 68, 69, 15, 124, 68, 71, 100, 75, 77, 70, 86, 101, 69, 70, 86, 101, 13, 68, 100, 120, 68, 125, 116, 24, 13, 70, 75, 79, 84, 69, 15, 79, 82, 71, 96, 101, 74, 69, 16, 108, 68, 72, 116, 28, 14, 70, 70, 101, 73, 72, 101, 117, 73, 69, 75, 113, 77, 69, 15, 23, 80, 108, 100, 105, 80, 69, 100, 28, 16, 68, 116, 24, 75, 108, 101, 79, 83, 71, 112, 101, 13, 69, 86, 101, 13, 125, 116, 91, 80, 108, 98, 109, 14, 70, 75, 100, 68, 71, 15, 75, 69, 71, 96, 101, 18, 69, 16, 121, 86, 108, 100, 121, 17, 71, 100, 121, 82, 70, 15, 79, 83, 69, 70, 101, 77, 70, 86, 101, 71, 124, 117, 101, 69, 124, 74, 91, 73, 108, 100, 28, 74, 111, 96, 101, 69, 69, 74, 116, 68, 71, 15, 75, 73, 69, 70, 101, 96, 71, 117, 109, 84, 108, 101, 113, 76, 69, 16, 121, 80, 125, 96, 101, 69, 70, 15, 86, 68, 72, 116, 28, 14, 70, 70, 101, 73, 72, 101, 117, 73, 69, 75, 113, 77, 69, 15, 23, 68, 70, 117, 121, 73, 70, 16, 117, 77, 69, 15, 24, 87, 111, 68, 82, 104, 119, 13, 86, 80, 108, 98, 78, 75, 69, 100, 90, 68, 125, 15, 79, 15, 125, 112, 101, 18, 69, 16, 120, 68, 71, 100, 75, 73, 108, 100, 125, 80, 124, 116, 70, 68, 69, 74, 28, 16, 111, 70, 101, 102, 125, 117, 109, 73, 108, 100, 79, 87, 108, 101, 79, 83, 71, 117, 108, 68, 125, 74, 91, 69, 125, 86, 100, 26 };
//		/* 33 */     for (int i = 0; i < arr_3.length; i++) {
//		/* 34 */       if (i % 2 == 0) {
//		/* 35 */         c = c + (char)((arr_3[i] ^ 0x20) - 3);
//		/*    */       } else {
//		/* 37 */         c = c + (char)((arr_3[i] ^ 0x20) + 3);
//		/*    */       } 
//		/*    */     }
//	}
//}
//
//	public static void main(String[] args) {
//		// TODO 自动生成的方法存根
//		Base64.Decoder decoder = Base64.getDecoder();
//		/*    */     ctf flag=new ctf();
//		/* 43 */     String d = new String(decoder.decode(a), StandardCharsets.UTF_8);
//		/* 44 */     String e = new String(decoder.decode(b), StandardCharsets.UTF_8);
//		/* 45 */     String f = new String(decoder.decode(c), StandardCharsets.UTF_8);
//		/* 46 */     d = new String(decoder.decode(d), StandardCharsets.UTF_8);
//		/*    */ 
//		/*    */     
////		/* 49 */    ctf.setExtensionName("Syc welcome you!!!  Happy game!!!!!!!");
////		/*    */     
////		/* 51 */     PrintWriter stdout = new PrintWriter(ctf.getStdout(), true);
////		/* 52 */     PrintWriter stderr = new PrintWriter(callbacks.getStderr(), true);
//		/*    */ 
//		/*    */     
//		/* 55 */     stdout.println(e);
//		/* 56 */     stderr.println(f + d);
//
//	}
//
//}
