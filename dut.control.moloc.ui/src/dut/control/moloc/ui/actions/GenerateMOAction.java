package dut.control.moloc.ui.actions;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import dut.control.moloc.util.MOLOC2MO;

public class GenerateMOAction implements IObjectActionDelegate {

    private ISelection selection;

    @Override
    public void run(IAction action) {
        try {
            IFile file = getSelectedFile();
            if (file == null) {
                return;
            }
            String absPath = file.getLocation().toOSString();
            MOLOC2MO.convertModelToMO(absPath);
//            Path out = MOLOC2MO.convertModelToMO(absPath);
            file.getParent().refreshLocal(IResource.DEPTH_INFINITE, null);

//            MessageDialog.openInformation(
//                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
//                "Generate MO",
//                "Generated: " + out.getFileName()
//            );
        } catch (Exception e) {
            MessageDialog.openError(
                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                "Generate MO",
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

    @Override
    public void selectionChanged(IAction action, ISelection selection) {
        this.selection = selection;
    }

    @Override
    public void setActivePart(IAction action, IWorkbenchPart targetPart) {
    }
}