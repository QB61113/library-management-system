package pers.xleixz.util;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * 设置表格数据段居中，用在图书信息管理和借阅管理窗体
 *
 * @author 小雷学长
 */
public class SetTableColumnCenter {

    /**
     * 表格数据居中
     *
     * @param table
     */
    public SetTableColumnCenter(JTable table) {
        DefaultTableCellRenderer r = new DefaultTableCellRenderer();
        r.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        table.setDefaultRenderer(Object.class, r);
    }

}
