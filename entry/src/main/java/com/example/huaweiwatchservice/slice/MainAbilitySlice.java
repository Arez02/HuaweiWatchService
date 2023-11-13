package com.example.huaweiwatchservice.slice;

import com.example.huaweiwatchservice.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.sensor.agent.CategoryMotionAgent;
import ohos.sensor.agent.SensorAgent;
import ohos.sensor.bean.CategoryMotion;
import ohos.sensor.data.CategoryEnvironmentData;
import ohos.sensor.data.CategoryMotionData;
import ohos.sensor.listener.ICategoryMotionDataCallback;

public class MainAbilitySlice extends AbilitySlice {
    private ICategoryMotionDataCallback motionDataCallback;
    private CategoryMotionAgent motionAgent;
    private SensorAgent sensorAgent;

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
    }

    @Override
    public void onActive() {
        super.onActive();
        motionAgent.getSingleSensor(2);
        sensorAgent.getSingleSensor(CategoryMotion.SENSOR_TYPE_LINEAR_ACCELERATION);
        motionAgent.getSingleSensor(CategoryMotion.SENSOR_TYPE_LINEAR_ACCELERATION);
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}