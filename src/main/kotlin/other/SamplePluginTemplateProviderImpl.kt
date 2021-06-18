package other

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import other.mvvm.activity.mvvmActivityTemplate
import other.mvvm.activity.mvvmActivityTemplate2
//import other.mvvm.fragment.mvvmFragmentTemplate
class SamplePluginTemplateProviderImpl : WizardTemplateProvider() {

    override fun getTemplates(): List<Template> = listOf(
            // activity的模板
            mvvmActivityTemplate,
            mvvmActivityTemplate2,
            // fragment的模板
//            mvvmFragmentTemplate
    )
}