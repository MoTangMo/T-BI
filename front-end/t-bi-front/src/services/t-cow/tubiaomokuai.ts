// @ts-ignore
/* eslint-disable */
import { request } from '@umijs/max';

/** 根据条件查询图表信息 POST /system/charts */
export async function getChartList(
  // 叠加生成的Param类型 (非body参数swagger默认没有生成对象)
  params: API.getChartListParams,
  options?: { [key: string]: any },
) {
  return request<API.R>('/system/charts', {
    method: 'POST',
    params: {
      ...params,
      condition: undefined,
      ...params['condition'],
    },
    ...(options || {}),
  });
}

/** 删除图表信息 DELETE /system/delChart */
export async function delChart(body: API.Chart, options?: { [key: string]: any }) {
  return request<API.R>('/system/delChart', {
    method: 'DELETE',
    headers: {
      'Content-Type': 'application/json',
    },
    data: body,
    ...(options || {}),
  });
}

/** 添加图表信息 POST /system/insertChart */
export async function insertChart(body: API.Chart, options?: { [key: string]: any }) {
  return request<API.R>('/system/insertChart', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    data: body,
    ...(options || {}),
  });
}

/** 更新图表信息 PUT /system/updateChart */
export async function updateChart(body: API.Chart, options?: { [key: string]: any }) {
  return request<API.R>('/system/updateChart', {
    method: 'PUT',
    headers: {
      'Content-Type': 'application/json',
    },
    data: body,
    ...(options || {}),
  });
}
