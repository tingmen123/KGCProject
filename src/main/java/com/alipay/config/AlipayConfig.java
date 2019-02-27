package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016092800612782";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCOFnkLMe3NIvjdzy88wCPnLvJZlbQorCRtIK9iqP7ypegDCNfRdmMDJZHEKGODwP2kO+3jn5By9k8Avscqsrm0MIfJqAxaouzBws9FgrDl0WZliFtY3jXuTkqrlMTwt0zRfHJqiHK5NE2mmojFyV6nKXBgzqEOOE9s9XqMcWyKm/kYdM5YqaeK7FYM4wBZUUch3k1WtR9Tq+2LiqeQv8FIIx4rLEmGRJLiMJE5o39C4geknGXF+nIm5NGVrfZldIoPgGGNUBMqPC7npoaeigRwcL7wJ2jIsjGFqUjX5epIcE85VjnEMqQyMil4A1I7YJNqNNI8qjaqYUHziEH4ka9zAgMBAAECggEAHZd+lB9M6Gk9LWzl6KAXmiFD5fZws/vOBlBFVqXdmwmEfYVM9VnTmycq6ZCD0T/TU24LyFlGCztTDtOsxS690FI/JXdzQzklV+FLq61hTCvFSKYSaDq3Pq9di8iLD5sNS5/AcIGEayACgA01KQQcS3Is7mx6TGzb1dR2NmO0+FTdVwQtAOh6uPCsXmrnnaWOxypNpLs6YqBt/JNtIqX0//Jvl3l3tjpxpCzVBByQuDVvE/FitpmGyA/Qmx8CPpUR4mcSF6Kt8ZLJR+UO3AS1Xe+qKZ6B+ZbO7hC9eLywB2M8d3ojrURVYTWCuE8DrVkVA625Rc+ncMwOLnUdTsLe4QKBgQDb7zrOI4i6qpRbDZfjahSjeNPURBDz87hOKnlmNwa+ti5Qlvt4t9GF5uklGWX+WZeMp5oYNwgORJ6jlEDQPjlst+TJo0xKEj4UIPkQEb03K7cEFSI7J71FUo8jdIpRNyR8p79YNPuSKg1fF1pfeAvHKmQL29k4dZL4o7+Utc5pIwKBgQClY0Q9voaSG8FO30WZIEfKhyDtalPpGBBFKbX5uFhBMrSSkwbWGfBvy4lFW8K/v3slkQ9Oqk6pjRxlzkRxF0hPX84TPXIPRhS+6lhVnPT9FYQkbW91AxeJUhML1WQZSCcB4GjGrK43AiTUUlXcFIyNcKkzZYG5weD3u35oWo+NcQKBgQDP4VIq78lX7s2lNrb/HBB/50AJnYCMpSvqrhjrNU2py1cBk4QDuXNQZk6uY1BVVmd5ah2rj7CMk+2CXinY60ep7DNTJ4d/Z7jHm9buimXXlPk64aLmWQx8Tqm+8HOgikdxj7i7bfDvWdIjtFYWcMhpKzc/QkESLYeKfnQh4qpEEwKBgQCD1OzAiu6Z6KXeSPshZCnVtoD4vpjEZPoTJ3x24gr3bYOikrAQWfzeIE/7iXljfy6ac1bQTdEGNgU84X6M5xIssyGBFKmmoyZGSGbBV6uxUUVUBCekDiLkwxeLhz2TKYBuboMWWu9DyeGxnS/zji27UOKOpYsSlwjMcBgC9q0XAQKBgHCY9jJnCexLb7sADmQhCKl65RnIZZFsV+PioW/JiTdn3KPoiYODoTNmbbkmR3bW6q2hN6IEPke8Wkai6CxB/QfpwOG/vNjerdBYewpgTZqKz+EDVwGM1XT9RaGltMVkLlQxXpKh44brqIayXHZzCc6NZUw95aAsq4GvVI13aZpg";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx4xQ+vmDA8nYCJzc99X2m1g4s7/NKKKlltKccjMn9X1mM+MXbDdRlliXT2VPxacFrphOy6bLBYSChwlZ+6S+TF3sng3F+4fMsn3lnXFZMe+GySsbEC46pxq7aXcTu00l62Gs+ozFU37SzuerzbnZM4/r3W7q6JfQzevwnqkkYX06L1k/mnVNdQELwThM+wPcPGCKYUyREnGbP7ShUP8BHtuLjGLd5aNa1r9NyFbqldLF21Wwgn1TbkUpeTzJbL1yPOQu5ydBIu8iOF45V22bKzQrp5ANxMG5qo0hwQX/JqsLMkBlsn4Kgo9O9/v1HRJQZvRGhjTWdmiXQV5H95VZfwIDAQAB+Cu8CQfM1jpD/pFk4htq/3SuMkC81rFdtYcZIcvCnYwEWyGA/+6Jo4253AscU1EQUV289lh2ioE8jSCFeZAZrOOQC5p4mVhxt4oE1kL7Jys8cKm7bwDmsMMQvafp09r4UcjTxEj1WGrvVygEIWLjLEfma2GjtzjHvJGtFHtsn5xg8TsLza2bWyBVN3Iams69/tCbMBv5LH03a3sIsFYDxha4IHxaUAvegVqOS9Mdd68dnwIDAQAB+8qXoAwjX0XZjAyWRxChjg8D9pDvt45+QcvZPAL7HKrK5tDCHyagMWqLswcLPRYKw5dFmZYhbWN417k5Kq5TE8LdM0XxyaohyuTRNppqIxclepylwYM6hDjhPbPV6jHFsipv5GHTOWKmniuxWDOMAWVFHId5NVrUfU6vti4qnkL/BSCMeKyxJhkSS4jCROaN/QuIHpJxlxfpyJuTRla32ZXSKD4BhjVATKjwu56aGnooEcHC+8CdoyLIxhalI1+XqSHBPOVY5xDKkMjIpeANSO2CTajTSPKo2qmFB84hB+JGvcwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

