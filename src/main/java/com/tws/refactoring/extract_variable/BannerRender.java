package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        boolean isIEOnMax = (platform.toUpperCase().contains("MAC")) &&
                (browser.toUpperCase().contains("IE"));
        if (isIEOnMax) {
            return Banner.IEONMAX.getMsg();
        }
        return Banner.BANNER.getMsg();
    }

    enum Banner{

        IEONMAX("IE on Mac?"),
        BANNER("banner");
        private String msg;

        Banner(String msg){
            this.msg = msg;
        }
        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
