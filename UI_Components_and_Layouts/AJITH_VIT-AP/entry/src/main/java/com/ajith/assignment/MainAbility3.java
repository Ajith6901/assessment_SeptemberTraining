package com.ajith.assignment;

import com.ajith.assignment.slice.MainAbility3Slice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility3 extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbility3Slice.class.getName());
    }
}