package org.ofdrw.core.graph.clips;

import org.dom4j.Element;

/**
 * 可裁剪对象
 * <p>
 * 实现该接口代表能够作为裁剪区域进行裁剪操作
 * <p>
 * 可裁剪对象为： CT_Path、CT_Text
 * <p>
 * 8.5 图 44 表 33
 */
public interface ClipAble extends Element {

    static ClipAble getInstance(Element e) {
        if (e == null) {
            return null;
        }
        String qName = e.getQualifiedName();
        ClipAble res = null;
        switch (qName) {
            case "Path":
                // TODO 2019-10-15 20:23:32 Path
                break;
            case "Text":
                // TODO 2019-10-15 20:23:49 Text
                break;
            default:
                throw new IllegalArgumentException("不支持裁剪对象类型：" + qName);
        }
        return res;
    }
}
