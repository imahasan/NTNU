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

import no.ntnu.tdt4250.group13.scheduling_algorithm.SchedulingAlgorithm;

public class BaseSchedulingAlgorithmNewTimetablePart {
	
	public String inputFileNames = "";
	public String outputFolderName = "";
	public Text inputFileNameText;
	public Text outputFileNameText;
	public Text outputFolderNameText;
	public Text errorText;

	@PostConstruct
	public void createComposite(Composite parent) {

		parent.setLayout(new GridLayout(1, false));

		// input configuration
		Label inputLabel = new Label(parent, SWT.PUSH);
		inputLabel.setText("Select input files one by one:");
		Button input = new Button(parent, SWT.PUSH);
		input.setText("Select input file...");
		inputFileNameText = new Text(parent, SWT.PUSH);
		inputFileNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		input.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(parent.getShell());
				inputFileNames = inputFileNames + dialog.open() + " ";
				if (inputFileNames != "") {
					inputFileNameText.setText(inputFileNames);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//
			}

		});
		
		// output configuration
		Label outputLabel = new Label(parent, SWT.PUSH);
		outputLabel.setText("\nSelect output folder:");
		Button output = new Button(parent, SWT.PUSH);
		output.setText("Select output folder...");
		outputFolderNameText = new Text(parent, SWT.PUSH);
		outputFolderNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		output.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog dialog = new DirectoryDialog(parent.getShell());
				outputFolderName = dialog.open();
				if (outputFolderName != "") {
					outputFolderNameText.setText(outputFolderName);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//
			}

		});
		Label fileName = new Label(parent, SWT.PUSH);
		fileName.setText("Output file name (spaces are not allowed and you don't have to specify the extension as it will be automatically set):");
		outputFileNameText = new Text(parent, SWT.BORDER);
		outputFileNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// algorithm launching
		Label algorithmLabel = new Label(parent, SWT.PUSH);
		algorithmLabel.setText("\n");
		Button startAlgorithm = new Button(parent, SWT.PUSH);
		startAlgorithm.setText("Start algorithm");
		startAlgorithm.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (inputFileNames == "" || outputFolderName == "" || outputFileNameText.getText() == "") {
					errorText.setText("ERROR: at least one argument is missing");
				} else {
					String output = inputFileNames + outputFolderName + "/" + outputFileNameText.getText() + ".timetable";
					String[] args = output.split(" ");
					SchedulingAlgorithm.main(args);
					errorText.setText("");
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//
			}

		});
		
		// error
		errorText = new Text(parent, SWT.PUSH);
		errorText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}
}