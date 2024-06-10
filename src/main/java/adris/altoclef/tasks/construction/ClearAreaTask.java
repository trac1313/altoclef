package adris.altoclef.tasks.construction;

import adris.altoclef.AltoClef;
import adris.altoclef.tasksystem.ITaskRequiresGrounded;
import adris.altoclef.tasksystem.Task;
import baritone.Baritone;
import baritone.api.process.IBaritoneProcess;
import baritone.api.selection.ISelection;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.BlockPos;
import baritone.selection.SelectionManager;
import baritone.api.selection.ISelectionManager;
import baritone.command.defaults.SelCommand;
import baritone.api.command.Command;
import baritone.utils.BaritoneProcessHelper;
import baritone.api.IBaritone;

import java.sql.Array;
import java.util.Arrays;

public class ClearAreaTask extends Task implements ITaskRequiresGrounded {

    public ClearAreaTask(AltoClef mod) {
        ISelection[] Selections = mod.getClientBaritone().getSelectionManager().getSelections();
        BlockPos from = Selections;
        BlockPos to = Selections.max()

    }
}

