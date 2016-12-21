package cn.jianke.moduleview.widget;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import cn.jianke.moduleview.R;
import cn.jianke.moduleview.common.ImageLoader;
import cn.jianke.moduleview.common.StringUtil;
import cn.jianke.moduleview.model.ModuleModel;

/**
 * @className: ModuleView
 * @classDescription:封装频道页模板
 * @author: leibing
 * @createTime: 2016/12/20
 */
public class ModuleView {

    /**
     * 获取频道页模板(封装一个模板)
     * @author leibing
     * @createTime 2016/12/20
     * @lastModify 2016/12/20
     * @param mModuleModel 数据源
     * @param mContext 上下文(页面引用)
     * @return
     */
    public static View getModuleView(ModuleModel mModuleModel, Context mContext){
       View view = LayoutInflater.from(mContext).inflate(R.layout.module_two, null);
        // findview
        ImageView moduleOneIv = (ImageView) view.findViewById(R.id.iv_module_one);
        ImageView moduleTwoIv = (ImageView) view.findViewById(R.id.iv_module_two);
        // update ui
        if (StringUtil.isNotEmpty(mModuleModel.getOneUrl()))
            ImageLoader.getInstance().load(mContext, moduleOneIv, mModuleModel.getOneUrl());
        if (StringUtil.isNotEmpty(mModuleModel.getTwoUrl()))
            ImageLoader.getInstance().load(mContext, moduleTwoIv, mModuleModel.getTwoUrl());
        // 返回模板View
        return view;
    }
}
