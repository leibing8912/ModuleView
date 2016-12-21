package cn.jianke.moduleview.module;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import cn.jianke.moduleview.R;
import cn.jianke.moduleview.model.ModuleModel;
import cn.jianke.moduleview.widget.ModuleView;

/**
 * @className: MainActivity
 * @classDescription: 添加模板页
 * @author: leibing
 * @createTime: 2016/12/20
 */
public class MainActivity extends AppCompatActivity {
    // 模板容器
    private LinearLayout mContainerLy;
    // 数据源
    private List<ModuleModel> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // findView
        mContainerLy = (LinearLayout) findViewById(R.id.ly_container);
        // 初始化数据源
        mData = new ArrayList<>();
        // 模拟添加数据源
        ModuleModel model = new ModuleModel();
        model.setOneUrl("http://www.baidu.com");
        model.setTwoUrl("http://www.jianke.com");
        mData.add(model);
        model = new ModuleModel();
        model.setOneUrl("http://www.baidu.com");
        model.setTwoUrl("http://www.jianke.com");
        mData.add(model);
        // 添加模板
        // 清空容器view
        mContainerLy.removeAllViews();
        for (ModuleModel mModuleModel: mData){
            // 模板view
            View moduleView = ModuleView.getModuleView(mModuleModel, this);
            // 添加模板view到容器
            mContainerLy.addView(moduleView);
        }
    }
}
