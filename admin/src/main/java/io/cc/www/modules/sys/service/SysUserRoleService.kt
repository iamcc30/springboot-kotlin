/**
 * Copyright 2018 人人开源 http://www.renren.io
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.cc.www.modules.sys.service

import com.baomidou.mybatisplus.service.IService
import io.cc.www.modules.sys.entity.SysUserRoleEntity


/**
 * 用户与角色对应关系
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2016年9月18日 上午9:43:24
 */
interface SysUserRoleService : IService<SysUserRoleEntity> {

    fun saveOrUpdate(userId: Long?, roleIdList: List<Long>)

    /**
     * 根据用户ID，获取角色ID列表
     */
    fun queryRoleIdList(userId: Long?): List<Long>

    /**
     * 根据角色ID数组，批量删除
     */
    fun deleteBatch(roleIds: Array<Long>): Int
}