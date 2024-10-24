#include <jni.h>
#include <string>
#include <android/log.h>

#define LOG_TAG "OhDarnScoresheet"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)

extern "C" JNIEXPORT void JNICALL
Java_com_example_ohdarnscoresheet_MainActivity_startNewGame(JNIEnv* env, jobject /* this */) {
    // Implement your logic for starting a new game here
    LOGI("Start Game button clicked");
    // You can replace this with actual game-starting logic
}

extern "C" JNIEXPORT void JNICALL
Java_com_example_ohdarnscoresheet_MainActivity_showPreviousGames(JNIEnv* env, jobject /* this */) {
    // Implement your logic for showing previous games here
    LOGI("Previous Games button clicked");
    // You can replace this with actual logic to display previous games
}
