/**
 * @Title: BrcMsg.java
 * @Package com.yy.zbase.business.inteyyadmin.broadcast.domain
 * @Description: 频道广播协议中高危透传到客户端的<msg></msg>节点中的广播内容类
 * Copyright: Copyright (c) 2014 
 * Company:YY
 * 
 * @author WuLiangzhi
 * @date Apr 20, 2014 11:58:23 AM
 * @version V1.0
 */

package study.javabase.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName: BrcMsg
 * @Description: 频道广播协议中高危透传到客户端的<msg></msg>节点中的广播内容类
 * @author WuLiangzhi
 * @date Apr 20, 2014 11:58:23 AM
 *
 */
@XmlRootElement(name="brcmsg")
public class BrcMsg {

    private String icon; //图标
    private String text; //文本内容
    private String link; //飞机票
    
    @XmlElement
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    @XmlElement
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    
    @XmlElement
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    
    
    
}
