package cn.qqtheme.framework.wheelview.interfaces;

/**
 * 联动选择回调
 *
 * @author liyujiang
 * @date 2019/6/17 18:23
 */
public interface OnLinkageSelectedListener<F extends LinkageTextProvider,
        S extends LinkageTextProvider, T extends TextProvider> {

    void onItemSelected(F first, S second, T third);

}
