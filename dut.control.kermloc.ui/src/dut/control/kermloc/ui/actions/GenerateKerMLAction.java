package dut.control.kermloc.ui.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;


import dut.control.kermloc.util.KerMLOC2KerML;

public class GenerateKerMLAction {

    private ISelection selection;

    public void run(IAction action) {
        try {
            IFile file = getSelectedFile();
            if (file == null) {
                return;
            }
            String absPath = file.getLocation().toOSString();
            KerMLOC2KerML.convertModelToKerml(absPath);
            file.getParent().refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (Exception e) {
            MessageDialog.openError(
                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                "Generate KerML",
                "Generation failed:\n" + e.getMessage()
            );
            e.printStackTrace();
        }
    }

    private IFile getSelectedFile() {
        if (!(selection instanceof IStructuredSelection)) return null;
        Object first = ((IStructuredSelection) selection).getFirstElement();
        if (first instanceof IFile) {
            return (IFile) first;
        }
        if (first instanceof IAdaptable) {
            return ((IAdaptable) first).getAdapter(IFile.class);
        }
        return null;
    }

    public void selectionChanged(IAction action, ISelection selection) {
        this.selection = selection;
    }

    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
    }
}
