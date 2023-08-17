package poc.war;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.tasks.bundling.War;

public class CustomWarPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().withType(War.class).configureEach(war ->
                war.setWebXml(project.file("src/example.xml")));
    }
}
