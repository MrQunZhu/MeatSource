package com.clesun.bigdataservice.utils;

//import com.clesun.auth.clesunauthsystem.v2.dto.TreeDto;

/**
 * author: lixq
 * date: 2018/5/7
 * 描述: 树状结构数据工具类
 */
public class TreeUtils {
/*    public static <T> List<TreeDto<T>> build(List<TreeDto<T>> nodes) {
        if (nodes == null) {
            return null;
        }
        List<TreeDto<T>> topNodes = new ArrayList<TreeDto<T>>();
        for (TreeDto<T> children : nodes) {
            String pid = children.getParentId();
            if (pid == null || "0".equals(pid)) {
                topNodes.add(children);
                continue;
            }
            for (TreeDto<T> parent : nodes) {
                String id = parent.getId();
                if (id != null && id.equals(pid)) {
                    parent.getChildren().add(children);
                    children.setHasParent(true);
                    parent.setChildren(true);
                    continue;
                }
            }

        }

        *//*TreeDto<T> root = new TreeDto<T>();
        root.setId("0");
        root.setParentId("");
        root.setHasParent(false);
        root.setChildren(true);
        root.setChecked(true);
        root.setChildren(topNodes);
        root.setText("根节点");
        Map<String, Object> state = new HashMap<>(16);
        state.put("opened", true);
        root.setState(state);*//*
        return topNodes;
    }

    public static <T> List<TreeDto<T>> buildList(List<TreeDto<T>> nodes, String idParam) {
        if (nodes == null) {
            return null;
        }
        List<TreeDto<T>> topNodes = new ArrayList<TreeDto<T>>();
        for (TreeDto<T> children : nodes) {
            String pid = children.getParentId();
            if (pid == null || idParam.equals(pid)) {
                topNodes.add(children);
                continue;
            }
            for (TreeDto<T> parent : nodes) {
                String id = parent.getId();
                if (id != null && id.equals(pid)) {
                    parent.getChildren().add(children);
                    children.setHasParent(true);
                    parent.setChildren(true);
                    continue;
                }
            }
        }
        return topNodes;
    }*/
}
