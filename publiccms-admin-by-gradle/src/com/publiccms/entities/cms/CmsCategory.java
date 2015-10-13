package com.publiccms.entities.cms;

// Generated 2015-6-25 11:28:56 by Hibernate Tools 4.3.1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sanluan.common.source.entity.MyColumn;

/**
 * CmsCategory generated by hbm2java
 */
@Entity
@Table(name = "cms_category")
public class CmsCategory implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Integer id;
    @MyColumn(title = "名称", condition = true, like = true)
    private String name;
    @MyColumn(title = "父分类", condition = true)
    private Integer parentId;
    private String childIds;
    @MyColumn(title = "英文名")
    private String englishName;
    @MyColumn(title = "模板路径")
    private String templatePath;
    @MyColumn(title = "路径")
    private String path;
    @MyColumn(title = "地址")
    private String url;
    @MyColumn(title = "内容路径")
    private String contentPath;
    @MyColumn(title = "每页数据")
    private Integer pageSize;
    @MyColumn(title = "是否删除", condition = true)
    private boolean disabled;
    @MyColumn(title = "内容数")
    private int contents;
    @MyColumn(title = "扩展字段1", condition = true)
    private String extend1;
    @MyColumn(title = "扩展字段2", condition = true)
    private String extend2;
    @MyColumn(title = "扩展字段3", condition = true)
    private String extend3;
    @MyColumn(title = "扩展字段4", condition = true)
    private String extend4;

    public CmsCategory() {
    }

    public CmsCategory(String name, String templatePath, String path, String contentPath, boolean disabled, int contents) {
        this.name = name;
        this.templatePath = templatePath;
        this.path = path;
        this.contentPath = contentPath;
        this.disabled = disabled;
        this.contents = contents;
    }

    public CmsCategory(String name, Integer parentId, String childIds, String englishName, String templatePath, String path,
            String url, String contentPath, Integer pageSize, boolean disabled, int contents, String extend1,
            String extend2, String extend3, String extend4) {
        this.name = name;
        this.parentId = parentId;
        this.childIds = childIds;
        this.englishName = englishName;
        this.templatePath = templatePath;
        this.path = path;
        this.url = url;
        this.contentPath = contentPath;
        this.pageSize = pageSize;
        this.disabled = disabled;
        this.contents = contents;
        this.extend1 = extend1;
        this.extend2 = extend2;
        this.extend3 = extend3;
        this.extend4 = extend4;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "parent_id")
    public Integer getParentId() {
        return this.parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Column(name = "child_ids", length = 65535)
    public String getChildIds() {
        return this.childIds;
    }

    public void setChildIds(String childIds) {
        this.childIds = childIds;
    }

    @Column(name = "english_name", length = 50)
    public String getEnglishName() {
        return this.englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @Column(name = "template_path", nullable = false)
    public String getTemplatePath() {
        return this.templatePath;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    @Column(name = "path", nullable = false, length = 500)
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Column(name = "url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "content_path", nullable = false, length = 500)
    public String getContentPath() {
        return this.contentPath;
    }

    public void setContentPath(String contentPath) {
        this.contentPath = contentPath;
    }

    @Column(name = "page_size")
    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Column(name = "disabled", nullable = false)
    public boolean isDisabled() {
        return this.disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    @Column(name = "contents", nullable = false)
    public int getContents() {
        return this.contents;
    }

    public void setContents(int contents) {
        this.contents = contents;
    }

    @Column(name = "extend1", length = 100)
    public String getExtend1() {
        return this.extend1;
    }

    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    @Column(name = "extend2", length = 100)
    public String getExtend2() {
        return this.extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    @Column(name = "extend3", length = 100)
    public String getExtend3() {
        return this.extend3;
    }

    public void setExtend3(String extend3) {
        this.extend3 = extend3;
    }

    @Column(name = "extend4", length = 100)
    public String getExtend4() {
        return this.extend4;
    }

    public void setExtend4(String extend4) {
        this.extend4 = extend4;
    }

}
