import { expect, test } from '@playwright/test';

test('home page renders project snapshot', async ({ page }) => {
  await page.goto('/');
  await expect(page.getByRole('heading', { name: 'Engineering Platform' })).toBeVisible();
  await expect(page.getByRole('heading', { name: 'Project Snapshot' })).toBeVisible();
});
