// @ts-ignore
/* eslint-disable */
import { request } from '@umijs/max';

/** 此处后端没有提供注释 GET /swagger-resources */
export async function swaggerResources(options?: { [key: string]: any }) {
  return request<API.SwaggerResource[]>('/swagger-resources', {
    method: 'GET',
    ...(options || {}),
  });
}

/** 此处后端没有提供注释 PUT /swagger-resources */
export async function swaggerResources3(options?: { [key: string]: any }) {
  return request<API.SwaggerResource[]>('/swagger-resources', {
    method: 'PUT',
    ...(options || {}),
  });
}

/** 此处后端没有提供注释 POST /swagger-resources */
export async function swaggerResources2(options?: { [key: string]: any }) {
  return request<API.SwaggerResource[]>('/swagger-resources', {
    method: 'POST',
    ...(options || {}),
  });
}

/** 此处后端没有提供注释 DELETE /swagger-resources */
export async function swaggerResources5(options?: { [key: string]: any }) {
  return request<API.SwaggerResource[]>('/swagger-resources', {
    method: 'DELETE',
    ...(options || {}),
  });
}

/** 此处后端没有提供注释 PATCH /swagger-resources */
export async function swaggerResources4(options?: { [key: string]: any }) {
  return request<API.SwaggerResource[]>('/swagger-resources', {
    method: 'PATCH',
    ...(options || {}),
  });
}

/** 此处后端没有提供注释 GET /swagger-resources/configuration/security */
export async function securityConfiguration(options?: { [key: string]: any }) {
  return request<API.SecurityConfiguration>('/swagger-resources/configuration/security', {
    method: 'GET',
    ...(options || {}),
  });
}

/** 此处后端没有提供注释 PUT /swagger-resources/configuration/security */
export async function securityConfiguration3(options?: { [key: string]: any }) {
  return request<API.SecurityConfiguration>('/swagger-resources/configuration/security', {
    method: 'PUT',
    ...(options || {}),
  });
}

/** 此处后端没有提供注释 POST /swagger-resources/configuration/security */
export async function securityConfiguration2(options?: { [key: string]: any }) {
  return request<API.SecurityConfiguration>('/swagger-resources/configuration/security', {
    method: 'POST',
    ...(options || {}),
  });
}

/** 此处后端没有提供注释 DELETE /swagger-resources/configuration/security */
export async function securityConfiguration5(options?: { [key: string]: any }) {
  return request<API.SecurityConfiguration>('/swagger-resources/configuration/security', {
    method: 'DELETE',
    ...(options || {}),
  });
}

/** 此处后端没有提供注释 PATCH /swagger-resources/configuration/security */
export async function securityConfiguration4(options?: { [key: string]: any }) {
  return request<API.SecurityConfiguration>('/swagger-resources/configuration/security', {
    method: 'PATCH',
    ...(options || {}),
  });
}

/** 此处后端没有提供注释 GET /swagger-resources/configuration/ui */
export async function uiConfiguration(options?: { [key: string]: any }) {
  return request<API.UiConfiguration>('/swagger-resources/configuration/ui', {
    method: 'GET',
    ...(options || {}),
  });
}

/** 此处后端没有提供注释 PUT /swagger-resources/configuration/ui */
export async function uiConfiguration3(options?: { [key: string]: any }) {
  return request<API.UiConfiguration>('/swagger-resources/configuration/ui', {
    method: 'PUT',
    ...(options || {}),
  });
}

/** 此处后端没有提供注释 POST /swagger-resources/configuration/ui */
export async function uiConfiguration2(options?: { [key: string]: any }) {
  return request<API.UiConfiguration>('/swagger-resources/configuration/ui', {
    method: 'POST',
    ...(options || {}),
  });
}

/** 此处后端没有提供注释 DELETE /swagger-resources/configuration/ui */
export async function uiConfiguration5(options?: { [key: string]: any }) {
  return request<API.UiConfiguration>('/swagger-resources/configuration/ui', {
    method: 'DELETE',
    ...(options || {}),
  });
}

/** 此处后端没有提供注释 PATCH /swagger-resources/configuration/ui */
export async function uiConfiguration4(options?: { [key: string]: any }) {
  return request<API.UiConfiguration>('/swagger-resources/configuration/ui', {
    method: 'PATCH',
    ...(options || {}),
  });
}
