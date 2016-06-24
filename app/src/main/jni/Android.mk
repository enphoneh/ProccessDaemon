LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE :=monitor
LOCAL_SRC_FILES :=proccessdaemon_aven_com_proccessdaemon_Watcher.cpp
include $(BUILD_SHARED_LIBRARY)