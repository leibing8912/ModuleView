package cn.jianke.moduleview.model;

/**
 * @className: ModuleModel
 * @classDescription: 模板数据
 * @author: leibing
 * @createTime: 2016/12/20
 */
public class ModuleModel {
    // 频道页 图片1 链接地址
    private String oneUrl = "";
    // 频道页 图片2 链接地址
    private String twoUrl = "";

    public String getOneUrl() {
        return oneUrl;
    }

    public void setOneUrl(String oneUrl) {
        this.oneUrl = oneUrl;
    }

    public String getTwoUrl() {
        return twoUrl;
    }

    public void setTwoUrl(String twoUrl) {
        this.twoUrl = twoUrl;
    }
}
