import request from '@/utils/request';

export function getFooterInfo() {
    return request({
      url: '/footer/info',
      method: 'get',
    });
  }
  