import { describe, expect, it } from 'vitest';
import { createPinia, setActivePinia } from 'pinia';
import { mount } from '@vue/test-utils';
import HomeView from '@/views/HomeView.vue';

describe('HomeView', () => {
  it('renders project snapshot heading', () => {
    setActivePinia(createPinia());
    const wrapper = mount(HomeView, {
      global: {
        stubs: {
          Card: {
            template: '<div><slot /></div>'
          }
        }
      }
    });

    expect(wrapper.text()).toContain('Project Snapshot');
  });
});
