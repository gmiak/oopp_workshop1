package gmiak.dv.project;

import gmiak.dv.project.controller.ProjectController;
import gmiak.dv.project.model.Project;
import gmiak.dv.project.view.ProjectView;

import javax.swing.SwingUtilities;

public final class ProjectTemplate {
	private ProjectTemplate() {
		/* No instances allowed! */
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				final Project project = new Project();
				final ProjectView projectView = new ProjectView(project);

				ProjectController.create(project, projectView);
				projectView.setVisible(true);
			}
		});
	}
}
