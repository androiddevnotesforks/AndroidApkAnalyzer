package sk.styk.martin.apkanalyzer.dependencyinjection.activity.detail

import android.app.Activity
import dagger.Binds
import dagger.Module
import sk.styk.martin.apkanalyzer.dependencyinjection.activity.ActivityCommonModule
import sk.styk.martin.apkanalyzer.dependencyinjection.viewmodel.ViewModelFactoriesModule
import sk.styk.martin.apkanalyzer.ui.appdetail.AppDetailActivity

@Module(includes = [
    ActivityCommonModule::class,
    ViewModelFactoriesModule::class,
    AppDetailActivityCommonModule::class,
])
abstract class AppDetailActivityModule {

    @Binds
    abstract fun activity(activity: AppDetailActivity): Activity

}