package io.protostuff.jetbrains.plugin.view.structure;

import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import io.protostuff.jetbrains.plugin.Icons;
import io.protostuff.jetbrains.plugin.psi.EnumConstantNode;
import org.jetbrains.annotations.NotNull;

public class ProtoEnumConstantTreeElement extends ProtoStructureViewElement<EnumConstantNode> {

    public ProtoEnumConstantTreeElement(EnumConstantNode element) {
        super(element);
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        return new ProtoItemPresentation(element.getName(), Icons.CONSTANT);
    }

    @NotNull
    @Override
    public TreeElement[] getChildren() {
        // No default children for enums.
        return new TreeElement[0];
    }


}
