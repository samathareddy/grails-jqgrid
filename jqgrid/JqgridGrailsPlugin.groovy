class JqgridGrailsPlugin {
    // the plugin version (Relates to version of jqgrid being used)
    def version = "3.7.2"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.4 > *"
    // the other plugins this plugin depends on
    def dependsOn = ['jqueryUi': "1.8.2.4 > *"]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp",
            "**/.gitignore"
    ]

    // TODO Fill in these fields
    def author = "Aaron Oathout"
    def authorEmail = "aoathout@gmail.com"
    def title = "Grails JQGrid Plugin"
    def description = '''\\
This plugin provides easy integration with the jqgrid jquery library.
'''

    // URL to the plugin's documentation
    def documentation = "http://aoathout.github.com/grails-jqgrid"

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before 
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}
