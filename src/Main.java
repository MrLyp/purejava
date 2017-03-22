/**
 * Created by lyp on 17/1/23.
 */
public class Main {

    public static class Parent {
        public int age = 100;

        public void say() {
            System.out.println("parent say");
        }
    }

    public static class Child extends Parent {
        public int age = 0;

        public Child() {
            this.age = 0;
            super.age = -1;
        }

        public void say() {
            System.out.println("child say");
        }
    }

    public static void main(String[] args) {
        String s = "{\\\"A\\\":\\\"Dalvik/2.1.0 (Linux; U; Android 5.1; ZTE C880A Build/LMY47D)\\\",\\\"B\\\":31,\\\"C\\\":\\\"3.10.65+\\\\nroot@zte-128 #1\\\\nMon Jul 25 19:00:43 CST 2016\\\",\\\"D\\\":[\\\"com.adobe.flashplayer\\\",\\\"com.dsemu.drasticcn\\\",\\\"com.sogou.speech.offlineservice\\\",\\\"com.xiaoji.emulator\\\",\\\"org.ppsspp.ppsspp\\\",\\\"com.wangyin.payment\\\",\\\"com.cootek.smartdialer\\\",\\\"jd.cdyjy.mommywant\\\",\\\"com.pp.assistant\\\",\\\"com.iflytek.inputmethod\\\"],\\\"E\\\":[\\\"org.simalliance.openmobileapi.uicc2terminal\\\",\\\"com.cootek.ztevoip\\\",\\\"com.utooo.huahualock.zte\\\",\\\"org.simalliance.openmobileapi.uicc1terminal\\\",\\\"com.zte.peripheralpolicy\\\",\\\"org.simalliance.openmobileapi.eseterminal\\\",\\\"com.android.providers.telephony\\\",\\\"com.android.providers.calendar\\\",\\\"com.zte.mirrorcamera\\\",\\\"com.android.galaxy4\\\"],\\\"F\\\":\\\"1.0.2\\\",\\\"G\\\":\\\"qcsbeta\\\",\\\"H\\\":{\\\"a\\\":32.075669,\\\"b\\\":118.771104,\\\"c\\\":1486993185388},\\\"a\\\":\\\"21AB6C4D9C2514D8D8BDEC1FAA9F7FA1E84898D8F5D7CCBA80DA72926900CBAC\\\",\\\"b\\\":\\\"dpsh2657ebf9187808fc99285d086caf7bc6atpu\\\",\\\"c\\\":{\\\"a\\\":\\\"78:eb:14:ec:5c:6a\\\",\\\"b\\\":\\\"\\\\\\\"ASUS000\\\\\\\"\\\"},\\\"d\\\":[{\\\"a\\\":\\\"00:9a:cd:a9:b0:d8\\\",\\\"b\\\":\\\"HUAWEI-Daniel 2.4G\\\"},{\\\"a\\\":\\\"ec:88:8f:31:17:62\\\",\\\"b\\\":\\\"FAST_311762\\\"},{\\\"a\\\":\\\"c8:3a:35:4d:87:18\\\",\\\"b\\\":\\\"mary\\\\u0027s 1004\\\"},{\\\"a\\\":\\\"b8:55:10:e7:58:3c\\\",\\\"b\\\":\\\"TP-LINK_30B6D6\\\"},{\\\"a\\\":\\\"52:1f:cc:b3:f2:59\\\",\\\"b\\\":\\\"iTV-stIG\\\"}],\\\"e\\\":[{\\\"a\\\":-4.999000072479248,\\\"b\\\":7.948999881744385,\\\"c\\\":-3.5239999294281006}],\\\"f\\\":\\\"1486890919304\\\",\\\"g\\\":[{\\\"a\\\":32852,\\\"b\\\":10,\\\"c\\\":46003,\\\"d\\\":14174,\\\"e\\\":\\\"cdma\\\"}],\\\"h\\\":\\\"ZTE C880A\\\",\\\"i\\\":\\\"ZTE\\\",\\\"j\\\":\\\"0\\\",\\\"k\\\":1915,\\\"l\\\":504,\\\"m\\\":\\\"7201280\\\",\\\"n\\\":66,\\\"o\\\":\\\"unpluged\\\",\\\"p\\\":\\\"A00000563C86C0\\\",\\\"q\\\":\\\"WIFI\\\",\\\"r\\\":100,\\\"s\\\":23040,\\\"t\\\":2556,\\\"u\\\":{\\\"a\\\":[{\\\"a\\\":\\\"91581bcdac5751bd2f96e14cfa245cb\\\",\\\"b\\\":1479917663},{\\\"a\\\":\\\"8aecdb53f4d423e06ef1b23df92c5ccd\\\",\\\"b\\\":1479917913},{\\\"a\\\":\\\"bd66ca69369b98a687d7c0737dabdd2\\\",\\\"b\\\":1479917948}],\\\"b\\\":3},\\\"v\\\":{\\\"a\\\":[{\\\"a\\\":\\\"77ed5e18ec12a125fcb5bb428d7226df\\\",\\\"b\\\":1486880}],\\\"b\\\":1},\\\"w\\\":\\\"1486644680907\\\",\\\"x\\\":\\\"460031270725931\\\",\\\"y\\\":\\\"89860315940250686571\\\",\\\"z\\\":\\\"ec:1d:7f:ed:73:c7\\\"}\",\n" +
                "  \"ip\": \"122.192.8.6\"\n" +
                "}";
        s = s.replaceAll("\\\\", "");
        System.out.print(s);
    }
}
