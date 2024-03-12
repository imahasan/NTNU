package no.ntnu.tdt4250.group13.timetable.uicontrols.parts;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import no.ntnu.tdt4250.group13.timetable.genhtml.main.Generate;

public class GeneratorsPart {
	
	public String inputFileName = "";
	public String outputFolderName = "";
	public Text inputFileNameText;
	public Text outputFolderNameText;

	@PostConstruct
	public void createComposite(Composite parent) {

		parent.setLayout(new GridLayout(1, false));

		// input configuration
		Label inputLabel = new Label(parent, SWT.PUSH);
		inputLabel.setText("Select input file:");
		Button input = new Button(parent, SWT.PUSH);
		input.setText("Select input file...");
		inputFileNameText = new Text(parent, SWT.PUSH);
		inputFileNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		input.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(parent.getShell());
				inputFileName = dialog.open();
				inputFileNameText.setText(inputFileName);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//
			}

		});

		// output configuration
		Label outputLabel = new Label(parent, SWT.PUSH);
		outputLabel.setText("\nSelect output folder:");
		Label outputAttentionLabel = new Label(parent, SWT.PUSH);
		outputAttentionLabel.setText("ATTENTION: For html generation, you MUST select the output folder corresponding to the 'src-gen' folder in the 'no.ntnu.tdt4250.group13.timetable.genhtml' project!");
		Button output = new Button(parent, SWT.PUSH);
		output.setText("Select output folder...");
		outputFolderNameText = new Text(parent, SWT.PUSH);
		outputFolderNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		output.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog dialog = new DirectoryDialog(parent.getShell());
				outputFolderName = dialog.open();
				outputFolderNameText.setText(outputFolderName);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//
			}

		});

		// generation
		Label generationLabel = new Label(parent, SWT.PUSH);
		generationLabel.setText("\nStart generation:");

		// html generation
		Button htmlGeneration = new Button(parent, SWT.PUSH);
		htmlGeneration.setText("Start html generation");
		htmlGeneration.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				String[] args = {inputFileName, outputFolderName};
				Generate.main(args);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//
			}

		});
		
		// html generation
		Button icsGeneration = new Button(parent, SWT.PUSH);
		icsGeneration.setText("Start ics generation");
		icsGeneration.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				String[] args = {inputFileName, outputFolderName};
				no.ntnu.tdt4250.group13.timetable.genics.main.Generate.main(args);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//
			}

		});
	}
}