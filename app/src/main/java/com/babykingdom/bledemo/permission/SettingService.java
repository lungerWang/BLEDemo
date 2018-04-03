package com.babykingdom.bledemo.permission;

/**
 * Created by Lunger on 2017/2/8.
 */

public interface SettingService extends CancelablePermission
{
    /**
     * Execute setting.
     */
    void execute();
}
