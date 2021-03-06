package org.crazydog.daoI.impl;

import org.crazydog.daoI.Basedao;
import org.crazydog.domain.ResumeFamilyEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 操作简历中的家庭信息的dao
 */
@Component
public class ResumeFamilydaoImpl extends Basedao<ResumeFamilyEntity> {

    /**
     * 添加家庭成员
     *
     * @param entity 家庭成员实体
     */
    public void addEntity(ResumeFamilyEntity entity) {
        hibernateTemplate.save(entity);
    }

    /**
     * 修改家庭成员
     *
     * @param entity 家庭成员实例
     */
    public void modifyEntity(ResumeFamilyEntity entity) {
        hibernateTemplate.update(entity);
    }

    /**
     * 删除家庭成员
     *
     * @param entity 家庭成员
     */
    public void deleteEntity(ResumeFamilyEntity entity) {
        hibernateTemplate.delete(entity);
    }

    /**
     * 获取所有的家庭成员
     */
    public List<ResumeFamilyEntity> getAllEntities() {
        return hibernateTemplate.loadAll(ResumeFamilyEntity.class);
    }

    /**
     * 获取所有的家庭成员
     */
    public ResumeFamilyEntity getEntity(int id) {
        return hibernateTemplate.get(ResumeFamilyEntity.class, id);
    }

    /**
     * 通过load获取指定的家庭成员实例
     *
     * @param id 家庭成员的id
     * @return id指定的家庭成员
     */
    public ResumeFamilyEntity loadEntity(int id) {
        return hibernateTemplate.load(ResumeFamilyEntity.class, id);
    }
}
