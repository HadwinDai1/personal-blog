import http from '@/utils/request';

export function getFooterInfo() {
    return request({
      url: '/getFooterInfo',
      method: 'get',
    });
  }
  